package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

/**
 * Контроллер, который агрегирует функционалные возможности согласно паттерна
 * MVP
 */
public class ControllerClass {
    // private iGetModel model;
    private iGetView view;
    private HashMap<String, iGetView> languageViewMap = new HashMap<>();
    private List<iGetModel> models;
    private List<Student> bufferedStudentList = new ArrayList<>(); // для MVP (prezenter)

    public ControllerClass(List<iGetModel> models, String lang) {
        languageViewMap.put("EN", new ViewClassEng());
        languageViewMap.put("RU", new ViewClass());

        this.models = models;
        if (languageViewMap.containsKey(lang.toUpperCase())) {
            this.view = languageViewMap.get(lang.toUpperCase());
        } else {
            this.view = languageViewMap.get("EN");
        }
    }


    /**
     * Проверка наличия данных о студентах
     * 
     * @param students - текущий список студентов (из модели)
     * @return true | false - результат проверки наличия каких-либо данных
     */
    private boolean testData(List<Student> students) {
        if (students.size() > 0) {
            return true;
        }
        return false;
    }

    /**
     * Обновление буффера данных о студентах, если данные есть
     */
    public void update() {
        // MVC
        // view.printAllStudent(model.getStudents());

        // MVP
        bufferedStudentList = new ArrayList<>();
        for (iGetModel model : models) {
            bufferedStudentList.addAll(model.getAllStudents());
        }
        if (testData(bufferedStudentList)) {
            view.printAllStudents(bufferedStudentList);
        } else {
            System.out.println("Список студентов пуст!");
        }
    }

    /**
     * Запуск основного рабочего цикла для взаимодействия с пользователем
     */
    public void run() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду: ");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    update();
                    // view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    operationDelete();
                    break;
                default:
                    System.out.println("Неизвестная команда");
                    break;
            }
        }
    }

    /**
     * Внутренний метод-агрегатор действий для команды удаления записи
     */
    private void operationDelete() {
        Integer idStudent = Integer.parseInt(
                view.prompt("Введите id студента для удаления: "));
        boolean isDeleted = false;
        for (iGetModel model : models) {
            if (model.deleteStudent(idStudent)) {
                isDeleted = true;
                break;
            }
        }
        if (isDeleted) {
            System.out.println("Студент ID=" + idStudent + " успешно удалён.");
        } else {
            System.out.println("Студент ID=" + idStudent + " такая запись не найдена.");
        }
    }
}
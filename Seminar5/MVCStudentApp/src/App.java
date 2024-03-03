import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.ModelClassHash;
import Model.FileModelClass;
import Model.Domain.Student;
import View.ViewClass;

public class App {
    public static void main(String[] args) throws Exception {
        List<Student> students = generatorStudents();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose language (Введите 'ru' для русского, 'en' for English): ");
        String languageChoice = scanner.nextLine();

        iGetView view = new ViewClass();
        iGetModel model = new ModelClass(new ArrayList<>());
        FileModelClass fileModel = new FileModelClass("StudentDB.csv");
        fileModel.clearDB();
        iGetModel hashModel = new ModelClassHash(new ArrayList<>());

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (i <= 1) {
                model.addNewStudent(student);
            } else if (i <= 4 ) {
                fileModel.addNewStudent(student);
            } else {
                hashModel.addNewStudent(student);
            }
        }
        
        ControllerClass controller = new ControllerClass(
            new ArrayList<>(Arrays.asList(model, fileModel, hashModel)), languageChoice
        );
        
        // controller.update();
        controller.run();

        scanner.close();
    }

    /**
     * Генератор списка студентов для программы
     * 
     * @return список студентов
     */
    public static List<Student> generatorStudents() {
        return new ArrayList<Student>(
                Arrays.asList(
                        new Student("Ivan", 20),
                        new Student("Olga", 19),
                        new Student("Andrei", 20),
                        new Student("Anna", 22),
                        new Student("Vova", 24),
                        new Student("Sergei", 19),
                        new Student("Dima", 22)));
    }
}
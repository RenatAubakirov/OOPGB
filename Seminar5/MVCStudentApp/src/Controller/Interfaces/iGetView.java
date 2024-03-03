package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

/**
 * Интерфейс представления, обеспечивает интерактивное взаимодействие с пользователем
 */
public interface iGetView {
    /**
     * Выводит пользователю информацию о полном списке объектов
     * @param students - список студентов для отображения
     */
    public void printAllStudents(List<Student> students);

    /**
     * Универсальный метод запроса информации от пользователя
     * @param message - сообщение, которое увидит пользователь перед вводом
     * @return данные String типа, которые введет пользователь
     */
    public String prompt(String message);
}

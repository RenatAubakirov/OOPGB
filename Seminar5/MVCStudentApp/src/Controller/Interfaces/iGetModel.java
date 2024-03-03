package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

/**
 * Интерфейс управления моделью студент
 */
public interface iGetModel {
    /**
     * Получение списка объектов хранимых в текущей модели
     * 
     * @return список студентов
     */
    public List<Student> getAllStudents();

    /**
     * Проверка наличия объекта в модели хранения
     * 
     * @param idStudent - id студента для поиска
     * @return true | false - результат проверки существует или нет
     */
    public boolean isStudentExist(Integer idStudent);

    /**
     * Удаление записи объекта из модели хранения
     * 
     * @param idStudent - id студента для поиска
     * @return true | false - результат удаления
     */
    public boolean deleteStudent(Integer idStudent);

    /**
     * Добавление новой записи объекта в модель хранения
     * 
     * @param student - объект студента
     * @return true | false - результат добавлен или нет
     */
    public boolean addNewStudent(Student student);
}


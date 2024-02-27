package services;

import domain.PersonComparator;
import domain.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс TeacherService реализует функции получения списка учителей,
 */
public class TeacherService extends PersonComparator<Teacher> implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teacherList;

    public TeacherService() {
        List<Teacher> teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return this.teacherList;
    }

    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, "учитель");
        teacherList.add(teacher);
        count++;
    }

    /**
     * Метод сортировки списка учителей
     */
    public void sortTeacherList() {
        this.teacherList.sort(new PersonComparator<Teacher>());
    }

    /**
     * Метод вывода в консоль отсортированного списка учителей
     */
    public void printSortTeacherList() {
        sortTeacherList();
        System.out.println(this.teacherList);
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}
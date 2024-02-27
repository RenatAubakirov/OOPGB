package services;

import domain.PersonComparator;
import domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iPersonService<Student>{
    private int count;
    private List<Student> studentList;

    public StudentService() {
        studentList = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return this.studentList;
    }

    @Override
    public void create(String name, int age) {
        Student student = new Student(name, age);
        studentList.add(student);
        this.count++;
    }
    public void sortByFIO(){
        // PersonComparator<Student> comparator = new PersonComparator<Student>();
        // this.listStudents.sort(comparator);
        this.studentList.sort(new PersonComparator<Student>());
    }
}
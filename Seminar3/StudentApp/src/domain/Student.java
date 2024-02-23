

package domain;
import java.lang.Comparable;

public class Student extends Person implements Comparable<Student> {
    private int idStudent;
    private static int idGenerator = 0;

    public Student(String name, int age) {
        super(name, age);
        idGenerator++;
        this.idStudent = idGenerator;
    }

    public int getIdStudent() {
        return idStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent + ", name=" + super.getName() + ", age=" + super.getAge() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.getAge() > o.getAge()) return 1;
        if (this.getAge() < o.getAge()) return -1;
        if (this.getIdStudent() > o.getIdStudent()) return 1;
        if (this.getIdStudent() < o.getIdStudent()) return -1;
        return 0;
    }
}
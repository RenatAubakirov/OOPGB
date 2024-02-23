package domain;

import java.util.Iterator;
import java.util.List;
import java.lang.Comparable;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private int idStudentGroup;
    private List<Student> studentList;

    public StudentGroup(int idStudentGroup, List<Student> studentList) {
        this.idStudentGroup = idStudentGroup;
        this.studentList = studentList;
    }

    public int getIdStudentGroup() {
        return idStudentGroup;
    }

    public void setIdStudentGroup(int idStudentGroup) {
        this.idStudentGroup = idStudentGroup;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "idStudentGroup=" + idStudentGroup + ", groupSize " + studentList.size() +
                ", studentList=" + studentList +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return studentList.iterator();
    }

    @Override
    public int compareTo(StudentGroup otherGroup) {
        return Integer.compare(this.getStudentList().size(), otherGroup.getStudentList().size());
    }
}
package domain;

import java.util.Iterator;
import java.util.List;

/**
 * Представляет поток студентов с указанием номера потока и списком групп студентов.
 */
public class StudentSteam implements Iterable<StudentGroup> {
    private int steamNumber; // Номер потока
    private List<StudentGroup> studentGroupList; // Список групп студентов в потоке

    /**
     * Конструктор для создания объекта StudentSteam.
     * @param steamNumber номер потока
     * @param studentGroupList список групп студентов в потоке
     */
    public StudentSteam(int steamNumber, List<StudentGroup> studentGroupList) {
        this.steamNumber = steamNumber;
        this.studentGroupList = studentGroupList;
    }

    /**
     * Получить номер потока.
     * @return номер потока
     */
    public int getSteamNumber() {
        return steamNumber;
    }

    /**
     * Установить номер потока.
     * @param steamNumber номер потока
     */
    public void setSteamNumber(int steamNumber) {
        this.steamNumber = steamNumber;
    }

    /**
     * Получить список групп студентов в потоке.
     * @return список групп студентов
     */
    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    /**
     * Установить список групп студентов в потоке.
     * @param studentGroupList список групп студентов
     */
    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    /**
     * Получить строковое представление объекта StudentSteam.
     * @return строковое представление объекта
     */
    @Override
    public String toString() {
        return "StudentSteam{" +
                "steamNumber=" + steamNumber + ", steamSize " + studentGroupList.size() +
                ", studentGroupList=" + studentGroupList +
                '}';
    }

    /**
     * Получить итератор для списка групп студентов в потоке.
     * @return итератор для списка групп студентов
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroupList.iterator();
    }

    /**
     * Сортировка групп студентов в потоке по количеству студентов в группе.
     */
    public void sortGroupsBySize() {
        studentGroupList.sort(StudentGroup::compareTo);
    }
}
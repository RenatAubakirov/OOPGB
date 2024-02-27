package controllers;

import domain.Person;
import domain.WorkingPerson;

import java.util.List;

public class AccountController {
    public static  <T extends WorkingPerson, V> void paySalary(T person, V salary) {
        System.out.println(person.getName() + " выплаченная зарплата: " + salary);
    }

    /**
     * @apiNote Метод для определения среднего возраста людей из списка. Тип человека ограничивается наследием класса Person
     * @param list лист с объектами-наследниками класса Person для определения среднего возраста
     * @param <M> тип-наследник класса Person
     */
    public static <M extends Person> void averageAge(List<M> list) {
        double sumForAverageAge = 0;
        for (M m : list) {
            sumForAverageAge = sumForAverageAge + m.getAge();
        }
        double averageAge = sumForAverageAge/ list.size();
        System.out.println("Средний возраст: "  + averageAge);
    }
}
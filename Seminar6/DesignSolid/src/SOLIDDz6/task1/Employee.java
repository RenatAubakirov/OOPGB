package SOLIDDz6.task1;

import java.util.Date;

/**
 * Класс, представляющий сотрудника компании.
 */
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    /**
     * Конструктор класса Employee.
     * @param name Имя сотрудника.
     * @param dob Дата рождения сотрудника.
     * @param baseSalary Базовая заработная плата сотрудника.
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }
	    /**
     * Метод получения информации о базовой зарплате работника.
     * @return базовую зарплату работника.
     */
    public int getBaseSalary() {
        return baseSalary;
    }

    /**
     * Получить информацию о сотруднике.
     * @return Информация о сотруднике.
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
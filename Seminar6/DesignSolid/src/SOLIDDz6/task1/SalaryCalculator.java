package SOLIDDz6.task1;

import java.util.List;
/**
 * Класс, отвечающий за расчет заработной платы сотрудника.
 */
public class SalaryCalculator {
    /**
     * Рассчитать чистую заработную плату сотрудника.
     * @param employee Сотрудник, чья заработная плата рассчитывается.
     * @return Чистая заработная плата сотрудника.
     */
    public int calculateNetSalary(Employee employee) {
        int baseSalary = employee.getBaseSalary();
        int tax = (int) (baseSalary * 0.25); 
        return baseSalary - tax;
    }
}
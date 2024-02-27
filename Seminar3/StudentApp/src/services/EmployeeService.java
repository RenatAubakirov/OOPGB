package services;

import domain.Employee;
import domain.PersonComparator;
import domain.Student;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iPersonService<Employee>{
    private int count;
    private List<Employee> employeeList;

    public EmployeeService() {
        employeeList = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return this.employeeList;
    }

    @Override
    public void create(String name, int age) {
        Employee employee = new Employee(name, age, "разнорабочий");
        employeeList.add(employee);
        this.count++;
    }
    public void sortByFIO(){
        this.employeeList.sort(new PersonComparator<Employee>());
    }
}
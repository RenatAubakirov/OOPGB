import java.util.ArrayList;
import java.util.List;

import controllers.AccountController;
import domain.Employee;
import domain.Student;
import domain.StudentGroup;
import domain.StudentSteam;
import domain.Teacher;
import services.TeacherService;


public class App {

    public static void main(String[] args) {
        // Создание списка студентов для первой группы
        List<Student> students1 = new ArrayList<>();
        // Создание объектов студентов
        Student student1 = new Student("Ivan", 20);
        Student student6 = new Student("Olga", 19);
        Student student7 = new Student("Andrei", 20);
        Student student2 = new Student("Anna", 22);
        Student student3 = new Student("Vova", 24);
        Student student4 = new Student("Sergei", 19);
        Student student5 = new Student("Dima", 22);
        // Добавление студентов в список
        students1.add(student1);
        students1.add(student7);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);
        students1.add(student5);
        students1.add(student6);

        // Создание объекта группы студентов
        StudentGroup studentGroup1 = new StudentGroup(1, students1);

        // Создание списка студентов для второй и третьей групп
        List<Student> students2 = new ArrayList<>();
        List<Student> students3 = new ArrayList<>();
        // Создание объектов студентов для второй группы
        Student student8 = new Student("Alex", 18);
        Student student9 = new Student("Igor", 23);
        // Создание объектов студентов для третьей группы
        Student student10 = new Student("Boris", 24);
        Student student11 = new Student("Kolya", 22);
        Student student12 = new Student("Katya", 20);
        // Добавление студентов в соответствующие списки
        students2.add(student8);
        students2.add(student9);
        students3.add(student10);
        students3.add(student11);
        students3.add(student12);

        // Создание списков групп студентов для разных потоков
        List<StudentGroup> studentGroupList1 = new ArrayList<>();
        List<StudentGroup> studentGroupList2 = new ArrayList<>();
        // Создание объектов групп студентов
        StudentGroup studentGroup2 = new StudentGroup(2, students2);
        StudentGroup studentGroup3 = new StudentGroup(3, students3);
        // Добавление групп в соответствующие списки
        studentGroupList1.add(studentGroup2);
        studentGroupList1.add(studentGroup1);
        studentGroupList1.add(studentGroup3);
        studentGroupList2.add(studentGroup3);

        // Создание потоков студентов
        StudentSteam studentSteam1 = new StudentSteam(1, studentGroupList1);
        StudentSteam studentSteam2 = new StudentSteam(2, studentGroupList2);

        // Вывод групп студентов для первого потока
        System.out.println("Print studentSteam1:");
        for (StudentGroup studentGroup : studentSteam1) {
            System.out.println(studentGroup);
        }
        // Вывод групп студентов для второго потока
        System.out.println("Print studentSteam2:");
        for (StudentGroup studentGroup : studentSteam2) {
            System.out.println(studentGroup);
        }

        // Сортировка групп студентов в первом потоке по количеству студентов
        studentSteam1.sortGroupsBySize();
        // Вывод отсортированных групп студентов для первого потока
        System.out.println("After sorting (amount of students in group is increased)");
        System.out.println("studentSteam1 printing:");
        for (StudentGroup studentGroup : studentSteam1) {
            System.out.println(studentGroup);
        }
                System.out.println("----Lesson4----");
        Employee worker1 = new Employee("Vasiliy", 55, "worker");
        Employee worker2 = new Employee("Andrey", 40, "worker");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(worker1);
        employeeList.add(worker2);
        Teacher teacher1 = new Teacher("Leonid", 33, "доцент");
        //AccountController controller = new AccountController();
        AccountController.paySalary(teacher1, 2000);
        AccountController.paySalary(worker1, 1000);
        Student studentVasya = new Student("Vasya Hitriy", 19);
        // controller.paySalary(studentVasya, 1000);

        System.out.println("----Homework4----");
        Teacher teacher2 = new Teacher("Aleksei", 30, "Старший преподаватель");
        Teacher teacher3 = new Teacher("Dmitry", 24, "Ассистент");
        Teacher teacher4 = new Teacher("Elena", 59, "Профессор");
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
        TeacherService teacherServiceList = new TeacherService();
        teacherServiceList.setTeacherList(teacherList); // передаем в экземпляр сервиса список учителей на сортировку
        teacherServiceList.printSortTeacherList(); // выполняем сортировку и вывод в консоль списка учителей
        System.out.print("Учителя: ");
        AccountController.averageAge(teacherList); // вывод среднего возраста учителей из списка
        System.out.print("Студенты: ");
        AccountController.averageAge(students2); // вывод среднего возраста студентов из списка
        System.out.print("Работники: ");
        AccountController.averageAge(employeeList); // вывод среднего возраста работников из списка
    }
    
}
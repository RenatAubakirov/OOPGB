package Model.Domain;

/**
 * Объект Студент - наследник абстрактного класса Персоны
 */
public class Student extends Person implements Comparable<Student> {
    private int id;

    private static int idGenerator;

    static {
        Student.idGenerator = 0;
    }

    /**
     * Конструктор нового объекта Студент
     * 
     * @param name - имя студента
     * @param age  - возраст студента
     */
    public Student(String name, int age) {
        super(name, age);
        idGenerator++;
        this.id = idGenerator;
    }

    /**
     * Конструктор объекта Студент с уже ранее присвоенным id (перегрузка
     * существующих записей)
     * 
     * @param name - имя студента
     * @param age  - возраст студента
     * @param id   - id студента
     */
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    /**
     * Получить id текущего студента
     * 
     * @return значение id
     */
    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student otherStudent) {
        System.out.println("Сравниваем " + this + " с " + otherStudent);
        if (this.getAge() > otherStudent.getAge()) {
            return 1;
        } else if (this.getAge() < otherStudent.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student [id=" + id +
                " name=" + super.getName() +
                " age=" + super.getAge() + "]";
    }

}

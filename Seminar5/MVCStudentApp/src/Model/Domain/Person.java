package Model.Domain;

/**
 * Абстрактный класс для наследования при создании новых объектов персон
 */
public abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Получить имя персоны
     * @return имя персоны
     */
    public String getName() {
        return name;
    }

    /**
     * Установить новое имя для текущей персоны
     * @param name - новое значение имени
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получить возраст текущей персоны
     * @return значение возраста
     */
    public int getAge() {
        return age;
    }

    /**
     * Обновить значение возраста для текущей персоны
     * @param age - новое значение возраста
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

package SOLIDDz6.task5;

/**
 * Класс, представляющий автомобиль.
 */
public class Car {
    private Engine engine;

    /**
     * Конструктор для создания объекта класса Car с заданным двигателем.
     *
     * @param engine Двигатель автомобиля.
     */
    public Car(Engine engine) {
        this.engine = engine;
    }

    /**
     * Метод для запуска автомобиля.
     */
    public void start() {
        this.engine.start();
    }
}


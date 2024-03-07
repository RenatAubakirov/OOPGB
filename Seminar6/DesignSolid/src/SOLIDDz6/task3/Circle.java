package SOLIDDz6.task3;

/**
 * Представляет круговую фигуру.
 */
public class Circle implements AreaShape {
    private double radius;

    /**
     * Создает круг с заданным радиусом.
     *
     * @param radius Радиус круга.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Вычисляет площадь круга.
     *
     * @return Площадь круга.
     */
    @Override
    public double area() {
        return 2 * Math.PI * radius;
    }
}


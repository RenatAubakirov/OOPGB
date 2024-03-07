package SOLIDDz6.task3;

/**
 * Представляет кубическую фигуру.
 */
public class Cube implements AreaShape, VolumeShape {
    private int edge;

    /**
     * Создает куб с заданной длиной ребра.
     *
     * @param edge Длина ребра куба.
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    /**
     * Вычисляет площадь куба.
     *
     * @return Площадь куба.
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    /**
     * Вычисляет объем куба.
     *
     * @return Объем куба.
     */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}


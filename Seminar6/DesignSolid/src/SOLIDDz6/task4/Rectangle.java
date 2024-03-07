package SOLIDDz6.task4;

/**
 * Класс, представляющий прямоугольник.
 */
public class Rectangle {
    private int width;
    private int height;

    /**
     * Устанавливает ширину прямоугольника.
     *
     * @param width Ширина прямоугольника.
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Устанавливает высоту прямоугольника.
     *
     * @param height Высота прямоугольника.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Вычисляет площадь прямоугольника.
     *
     * @return Площадь прямоугольника.
     */
    public int area() {
        return this.width * this.height;
    }
}

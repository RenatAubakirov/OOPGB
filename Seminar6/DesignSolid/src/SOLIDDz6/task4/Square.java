package SOLIDDz6.task4;

/**
 * Класс, представляющий квадрат.
 */
public class Square extends Rectangle {
    /**
     * Устанавливает ширину квадрата.
     * Поскольку у квадрата равны стороны, вызов этого метода
     * устанавливает и ширину, и высоту одновременно.
     *
     * @param width Сторона квадрата.
     */
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    /**
     * Устанавливает высоту квадрата.
     * Поскольку у квадрата равны стороны, вызов этого метода
     * устанавливает и ширину, и высоту одновременно.
     *
     * @param height Сторона квадрата.
     */
    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}

package Domain;

/**
 * Класс, представляющий комплексное число.
 */
public class ComplexNumber {
    private double real; // Реальная часть комплексного числа
    private double imaginary; // Мнимая часть комплексного числа

    /**
     * Конструктор для создания комплексного числа.
     * @param real Реальная часть комплексного числа.
     * @param imaginary Мнимая часть комплексного числа.
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Получить реальную часть комплексного числа.
     * @return Реальная часть комплексного числа.
     */
    public double getReal() {
        return real;
    }

    /**
     * Получить мнимую часть комплексного числа.
     * @return Мнимая часть комплексного числа.
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Установить реальную часть комплексного числа.
     * @param real Новое значение реальной части комплексного числа.
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * Установить мнимую часть комплексного числа.
     * @param imaginary Новое значение мнимой части комплексного числа.
     */
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    /**
     * Переопределение метода toString для красивого вывода комплексного числа в строку.
     * @return Строковое представление комплексного числа.
     */
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }
}

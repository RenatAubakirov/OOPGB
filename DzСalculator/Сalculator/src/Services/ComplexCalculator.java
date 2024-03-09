package Services;

import Domain.ComplexNumber;

/**
 * Интерфейс для выполнения операций над комплексными числами.
 */
public interface ComplexCalculator {

    /**
     * Сложение двух комплексных чисел.
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Сумма двух комплексных чисел.
     */
    ComplexNumber add(ComplexNumber num1, ComplexNumber num2);

    /**
     * Умножение двух комплексных чисел.
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат умножения двух комплексных чисел.
     */
    ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2);

    /**
     * Деление двух комплексных чисел.
     * @param num1 Делимое комплексное число.
     * @param num2 Делитель комплексное число.
     * @return Результат деления двух комплексных чисел.
     * @throws ArithmeticException Исключение, если делитель равен нулю.
     */
    ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) throws ArithmeticException;
}

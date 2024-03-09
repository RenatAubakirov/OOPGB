package Services;

import Domain.ComplexNumber;

/**
 * Реализация интерфейса ComplexCalculator для выполнения операций над комплексными числами.
 */
public class ComplexCalculatorImpl implements ComplexCalculator {

    /**
     * Выполняет операцию сложения двух комплексных чисел.
     *
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат сложения комплексных чисел.
     */
    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getReal() + num2.getReal();
        double imaginary = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(real, imaginary);
    }

    /**
     * Выполняет операцию умножения двух комплексных чисел.
     *
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат умножения комплексных чисел.
     */
    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginary = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(real, imaginary);
    }

    /**
     * Выполняет операцию деления двух комплексных чисел.
     *
     * @param num1 Первое комплексное число (делимое).
     * @param num2 Второе комплексное число (делитель).
     * @return Результат деления комплексных чисел.
     * @throws ArithmeticException если делитель равен нулю.
     */
    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) throws ArithmeticException {
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        double real = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imaginary = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
        return new ComplexNumber(real, imaginary);
    }
}
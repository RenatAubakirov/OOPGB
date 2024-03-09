import java.util.Scanner;

import Domain.ComplexNumber;
import Services.ComplexCalculator;
import Services.ComplexCalculatorImpl;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите реальную часть первого комплексного числа:");
            double real1 = scanner.nextDouble();

            System.out.println("Введите мнимую часть первого комплексного числа:");
            double imaginary1 = scanner.nextDouble();

            System.out.println("Введите реальную часть второго комплексного числа:");
            double real2 = scanner.nextDouble();

            System.out.println("Введите мнимую часть второго комплексного числа:");
            double imaginary2 = scanner.nextDouble();

            ComplexNumber num1 = new ComplexNumber(real1, imaginary1);
            ComplexNumber num2 = new ComplexNumber(real2, imaginary2);

            ComplexCalculator calculator = new ComplexCalculatorImpl();

            System.out.println("Сложение: " + calculator.add(num1, num2));
            System.out.println("Умножение: " + calculator.multiply(num1, num2));
            try {
                System.out.println("Деление: " + calculator.divide(num1, num2));
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        } finally {
            scanner.close();
        }
    }
}
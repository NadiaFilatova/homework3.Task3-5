package homework;

// Використовуючи IntelliJ IDEA, створіть клас Calculator. Створіть метод з ім'ям calculate,
// який приймає як параметри три цілочислові значення та повертає значення кожного аргументу, поділеного на 5.
public class Calculator {
    public static void main(String[] args) {
        int a = 12, b = 12345, c = 345;
        System.out.println(calculate(a, b, c));
    }

    public static Object calculate(int a, int b, int c) {
        float a1 = (float) a / 5;
        float b1 = (float) b / 5;
        float c1 = (float) c / 5;
        return " значення   1 аргументу = " + a1 + " значення 2 аргументу =  " + b1 + " значення  3 аргументу = " + c1;
        // МЕТОД, звичайно, ПОВЕРТАЄ значення кожного аргумета, але виглядає це як "лайно-код"
        // Нічого розумнішого не придумала, ніж використати базовий клас (Object).
    }
}

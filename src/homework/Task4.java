package homework;

import java.util.Arrays;
import java.util.Scanner;

// Створіть три перевантажені методи для пошуку середнього арифметичного числа з 3, 4, 5
// змінних, створіть метод для пошуку мінімального, максимального та середнього значень серед цих трьох методів.
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введіть  5 чисeл для обрахування ");
        float a1 = scanner.nextFloat();
        float a2 = scanner.nextFloat();
        float a3 = scanner.nextFloat();
        float a4 = scanner.nextFloat();
        float a5 = scanner.nextFloat();
        System.out.println("Середнє арифметичне 5 - ти чисел = " + average(a1, a2, a3, a4, a5));
        float s1 = average(a1, a2, a3);
        float s2 = average(a1, a2, a3, a4);
        float s3 = average(a1, a2, a3, a4, a5);
        summary(s1, s2, s3);
    }

    public static float average(float a1, float a2, float a3) {
        return (a1 + a2 + a3) / 3;
    }

    public static float average(float a1, float a2, float a3, float a4) {
        return (a1 + a2 + a3 + a4) / 4;
    }

    public static float average(float a1, float a2, float a3, float a4, float a5) {
        return (a1 + a2 + a3 + a4 + a5) / 5;
    }

    public static void summary(float... args) {
        Arrays.sort(args);
        System.out.println("мінімальнe = " + args[0] + "середнє = " + args[1] + "максимальнe = " + args[2]);
    }
}

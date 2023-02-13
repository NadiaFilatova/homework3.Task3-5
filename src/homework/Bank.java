package homework;
//Використовуючи IntelliJ IDEA, створіть клас Bank.
// Уявіть, що ви реалізуєте програму для банку, яка допомагає визначити, погасив клієнт кредит чи ні.
// Припустимо, щомісячна сума платежу має становити 100 грн.
// Клієнт має виконати 7 платежів, але може платити рідше великими сумами.
// Тобто може двома платежами по 300 і 400 грн закрити весь борг.
//Створіть метод, який як аргумент прийматиме суму платежу, введену економістом банку.
// Метод виводить на екран інформацію про стан кредиту
// (сума заборгованості, сума переплат, повідомлення про відсутність боргу).
import java.util.Scanner;

// на мою думку., тут  БУЛО Б краже використати ООП

public class Bank {
    private static int sum = 700;

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int a;
        for (int i = 0; i < 7; i++) {
            a = scanner.nextInt();
            while (a < 100) {
                System.out.println(" щомісячна сума платежу має становити 100 чи більше  грн ");
                a = scanner.nextInt();
            }
            bank(a);
            if (sum <= 0) {
                System.out.println("Борг погашено");
                break;
            }
        }
    }

    public static void bank(int a) {
        sum -= a;
        if (sum > 0) {
            System.out.println(" сума заборгованості " + sum);
        } else if (sum < 0) {
            System.out.println(" сума переплат " + sum);
        }
    }
}
import java.util.Scanner;

// УРОК 8. Цикл do...while
public class Lesson08_DoWhile {
    public static void main(String[] args) {
        // do...while выполнится МИНИМУМ 1 раз: условие проверяется ПОСЛЕ тела
        int i = 10;
        do {
            System.out.println("i = " + i); // напечатается, хотя 10 < 5 - ложь
            i++;
        } while (i < 5);

        // Типичное применение: просим ввод, пока он неверный
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите число от 1 до 10:");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);
        System.out.println("Вы ввели: " + number);

        scanner.close();
    }
}

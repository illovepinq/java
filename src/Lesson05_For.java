// УРОК 5. Цикл for
public class Lesson05_For {
    public static void main(String[] args) {
        // for (старт; условие; шаг)
        for (int i = 0; i < 5; i++) {
            System.out.println(i);           // 0 1 2 3 4
        }

        System.out.println("--- чётные до 10");
        for (int i = 0; i <= 10; i += 2) {   // шаг можно менять
            System.out.println(i);
        }

        System.out.println("--- обратный отсчёт");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);           // 5 4 3 2 1
        }

        System.out.println("--- таблица умножения на 7");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 * " + i + " = " + (7 * i));
        }

        // ЗАДАНИЕ: выведи таблицу умножения на любое своё число
    }
}

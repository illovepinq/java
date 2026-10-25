// УРОК 9. Операторы break и continue
public class Lesson09_BreakContinue {
    public static void main(String[] args) {
        // break: полностью ВЫХОДИТ из цикла
        System.out.println("--- break");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;                   // цикл остановится, когда i станет 5
            }
            System.out.println(i);       // 0 1 2 3 4
        }

        // continue: пропускает ТЕКУЩИЙ шаг и идёт к следующему
        System.out.println("--- continue");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;                // чётные пропускаем
            }
            System.out.println(i);       // 1 3 5 7 9
        }

        // ЗАДАНИЕ: выведи числа от 1 до 20, пропуская кратные 3, и остановись на 15
    }
}

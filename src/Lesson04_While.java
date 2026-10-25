// УРОК 4. Цикл while
public class Lesson04_While {
    public static void main(String[] args) {
        // Счётчик создаём ДО цикла
        int i = 0;
        while (i < 5) {           // пока условие true - цикл работает
            System.out.println(i); // 0 1 2 3 4
            i++;                  // без этой строки цикл будет БЕСКОНЕЧНЫМ
        }

        // Сумма чисел от 1 до 10
        int sum = 0;
        int n = 1;
        while (n <= 10) {
            sum += n;             // то же самое, что sum = sum + n
            n++;
        }
        System.out.println("Сумма: " + sum); // 55

        // ЗАДАНИЕ: выведи числа от 10 до 1 циклом while
    }
}

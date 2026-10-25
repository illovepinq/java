import java.util.Arrays;

// УРОК 11. Массивы в Java
public class Lesson11_Arrays {
    public static void main(String[] args) {
        // Способ 1: размер известен, значений пока нет (заполнено нулями)
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {   // length БЕЗ скобок
            numbers[i] = i * 10;                     // 0 10 20 30 40
        }

        // Способ 2: значения известны сразу, размер Java считает сама
        int[] arr = {4, 8, 15, 16, 23, 42};

        // Вывод через for
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Быстрый вывод всего массива
        System.out.println(Arrays.toString(numbers)); // [0, 10, 20, 30, 40]
        // Ловушка: System.out.println(numbers) напечатает адрес вроде [I@1b6d3586

        // Сумма элементов
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма: " + sum);          // 108

        // Максимум: берём первый элемент и сравниваем с остальными
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимум: " + max);       // 42

        // Обратный порядок: идём с конца
        System.out.println("--- в обратном порядке");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        // ЭКСПЕРИМЕНТ: напиши arr[6] и прочитай ошибку ArrayIndexOutOfBoundsException
    }
}

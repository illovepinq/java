// УРОК 12. Цикл for each. Массивы строк
public class Lesson12_ForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // for each читается как "для каждого n из numbers"
        for (int n : numbers) {
            System.out.println(n);
        }

        // Массив строк
        String[] names = {"Bob", "Alice", "Tom"};
        for (String name : names) {
            System.out.println("Привет, " + name);
        }

        // Пустой массив строк: значения по умолчанию - null
        String[] words = new String[3];
        System.out.println(words[0]);   // null
        words[0] = "Java";
        System.out.println(words[0]);   // Java

        // Минус for each: n это КОПИЯ элемента, массив он не меняет
        for (int n : numbers) {
            n = n * 2;
        }
        System.out.println(numbers[0]); // всё ещё 1

        // Чтобы изменить элементы, нужен обычный for с индексом
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        System.out.println(numbers[0]); // уже 2
    }
}

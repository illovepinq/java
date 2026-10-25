import java.util.Scanner; // подключаем Scanner

// УРОК 7. Ввод данных. Класс Scanner
// Запусти и вводи данные в окне Run (внизу), после каждого ответа жми Enter
public class Lesson07_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // чтение с клавиатуры

        System.out.println("Введите имя:");
        String name = scanner.nextLine();         // строка целиком

        System.out.println("Введите возраст:");
        int age = scanner.nextInt();              // целое число

        // Дробное число: разделитель зависит от настроек системы.
        // Если вылетает InputMismatchException - попробуй вместо запятой точку (или наоборот)
        System.out.println("Введите рост, например 1,75:");
        double height = scanner.nextDouble();

        System.out.println(name + ", " + age + " лет, рост " + height);

        // Ловушка: после nextInt() следующий nextLine() вернёт пустую строку,
        // потому что nextInt не забирает символ Enter. Лечится лишним nextLine():
        scanner.nextLine();                       // "съедаем" остаток строки
        System.out.println("Введите город:");
        String city = scanner.nextLine();
        System.out.println("Город: " + city);

        scanner.close();
    }
}

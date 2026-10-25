// УРОК 2. Переменные. Примитивные типы данных
public class Lesson02_Variables {
    public static void main(String[] args) {
        int age = 25;              // целое число
        double price = 99.99;      // дробное число
        boolean isStudent = true;  // только true или false
        char letter = 'A';         // один символ, в ОДИНАРНЫХ кавычках
        long big = 10000000000L;   // очень большое целое, в конце буква L
        byte small = 10;           // маленькое целое (от -128 до 127)

        System.out.println(age);
        System.out.println(price);
        System.out.println(isStudent);
        System.out.println(letter);
        System.out.println(big);
        System.out.println(small);

        // Значение переменной можно менять
        age = 26;
        System.out.println(age); // 26

        // Автоматическое расширение: меньший тип -> больший, ошибок нет
        int a = 5;
        double b = a;            // станет 5.0
        System.out.println(b);

        // Явное приведение: больший тип -> меньший, дробная часть ОТБРАСЫВАЕТСЯ
        double c = 9.99;
        int d = (int) c;         // станет 9 (не 10! округления нет)
        System.out.println(d);

        // ЗАДАНИЕ: создай переменные для своего роста (double) и первой буквы имени (char)
    }
}

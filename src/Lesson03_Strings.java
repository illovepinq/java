// УРОК 3. Строки (String). Ссылочные типы данных
public class Lesson03_Strings {
    public static void main(String[] args) {
        // String - ссылочный тип, пишется с БОЛЬШОЙ буквы, значения в двойных кавычках
        String name = "Bob";
        String surname = "Smith";

        // Конкатенация (склейка) через +
        String fullName = name + " " + surname;
        System.out.println(fullName);                 // Bob Smith

        // Полезные методы строки (у методов всегда скобки)
        System.out.println(fullName.length());        // 9 - длина строки
        System.out.println(fullName.toUpperCase());   // BOB SMITH
        System.out.println(fullName.toLowerCase());   // bob smith
        System.out.println(fullName.charAt(0));       // B - символ по индексу (с нуля)
        System.out.println(fullName.contains("Smith")); // true

        // Строки сравниваем через equals, а НЕ через ==
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2));            // true

        // Число + строка = строка
        int x = 5;
        System.out.println("x = " + x);               // x = 5
        System.out.println(1 + 2 + "3");              // 33 (сначала 1+2=3, потом "3")
        System.out.println("1" + 2 + 3);              // 123 (всё склеивается как текст)

        // ЗАДАНИЕ: выведи длину своего имени и его первую букву
    }
}

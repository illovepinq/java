// УРОК 6. Условный оператор if
public class Lesson06_If {
    public static void main(String[] args) {
        int age = 17;

        if (age >= 18) {
            System.out.println("Взрослый");
        } else if (age >= 14) {
            System.out.println("Подросток");   // сработает это
        } else {
            System.out.println("Ребёнок");
        }

        // Логические операторы: && (и), || (или), ! (не)
        int number = 15;
        if (number > 10 && number < 20) {
            System.out.println("Число от 10 до 20");
        }

        // Остаток от деления %: чётное или нет
        if (number % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }

        // Для закрепления for + if: FizzBuzz
        System.out.println("--- FizzBuzz");
        for (int i = 1; i <= 15; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");   // делится и на 3, и на 5
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // ЗАДАНИЕ: поменяй age и посмотри, как меняется вывод
    }
}

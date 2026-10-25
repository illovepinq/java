// УРОК 10. Оператор switch
public class Lesson10_Switch {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;      // без break выполнение "провалится" в следующий case
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            default:        // если ни один case не подошёл
                System.out.println("Другой день");
        }

        // Несколько case подряд (break нарочно убран между ними)
        int month = 7;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            default:
                System.out.println("Другое время года");
        }

        // ЭКСПЕРИМЕНТ: убери первый break и посмотри, что изменится
    }
}

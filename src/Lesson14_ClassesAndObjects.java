public class Lesson14_ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Ромчик";
        person1.age = 67;
        String move = person1.move();
        System.out.println(move);
        System.out.println("Меня зовут " +person1.name+ "!"+" "+"Мне исполнилось сегодня " +person1.age+" "+"лет!");
    }
}

class Person {
    String name;
    int age;
    public String move(){
        return "я никита";
    }
}


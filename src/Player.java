import java.util.ArrayList;
import java.util.List;

class Player {
    private final long id;
    private String nickname;
    private long balance;
    private List<Item> item = new ArrayList<>();

    public Player(long id, String nickname, long balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Начальный баланс не может быть отрицательным");
        }
        this.id = id;
        this.nickname = nickname;
        this.balance = balance;
    }

    public void addItem(Item item) {
        this.item.add(item);
    }
    public List<Item> getItems() {return item;}

    public long getId() {return id;}
    public String getNickname() {return nickname;}
    public long getBalance() {return  balance;}

    public void deposit(long amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма пополнения должна быть больше 0€$");
        }
        this.balance += amount;
    }
    public void showInventory() {
        for (Item item : this.item) {
            System.out.println(
                    "ID: " + item.getId()
                    + ", Название: " + item.getName()
                    + ", Категория: " + item.getCategory()
                    + ", Редкость: " + item.getRarity()
            );
        }
    }
    public void withdraw(long amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма списания должна быть больше 0€$");
        }
        this.balance -= amount;
        if (this.balance < amount) {
            throw new IllegalArgumentException("У вас недостаточно средств для покупки товара!");
        }
    }
    public void removeItem(Item item) {
        this.item.remove(item);
    }
}
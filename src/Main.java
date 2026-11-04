public class Main {
    public static void main(String[] args) {

        Player alex = new Player(1l,"Alex",1500);
        Marketplace marketplace = new Marketplace();
        marketplace.registerPlayer(alex);
        Item chrome = new Item(1L, "Chrome", Category.WEAPON, Rarity.LEGENDARY, 1L);
        marketplace.addItem(chrome);
        alex.showInventory();

        Player steve = new Player(2l,"Steve",1500);
        marketplace.registerPlayer(steve);
        Item mecha = new Item(2l, "Mecha", Category.ARMOR, Rarity.EPIC, 2L);
        marketplace.addItem(mecha);
        steve.showInventory();
    }
}



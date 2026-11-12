import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Marketplace {
    private final Map<Long, Player> players = new HashMap<>();
    private final Map<Long, Item> items = new HashMap<>();
    private final Map<Long, Listing> listings = new HashMap<>();

    public void registerPlayer(Player player) {
        if (players.containsKey(player.getId())) {
            throw new IllegalArgumentException("Игрок с таким ID уже существует!");
        }
        players.put(player.getId(), player);
    }

    public void addItem(Item item) {
        if (items.containsKey(item.getId())) {
            throw new IllegalArgumentException("Предмет с таким ID уже существует!");
        }
        Player owner = players.get(item.getOwnerId());
        if (owner == null) {
            throw new IllegalArgumentException("Владелец с таким ID не зарегистрирован!");
        }
        owner.addItem(item);
        items.put(item.getId(), item);
    }

    public void createListing(long listingId, long itemId, long sellerId, long price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Сумма товара должна быть больше 0!€$");
        }
        if (listings.containsKey(listingId)) {
            throw new IllegalArgumentException("Объявление с таким ID уже существует!");
        }
        Player seller = players.get(sellerId);
        if (seller == null) {
            throw new IllegalArgumentException("Продавец не зарегистрирован!");
        }
        Item item = items.get(itemId);
        if (item == null) {
            throw new IllegalArgumentException("Предмет с таким ID не найден!");
        }
        if (item.getOwnerId() != seller.getId()) {
            throw new IllegalArgumentException("Вы пытаетесь продать чужой предмет!");
        }
        for (Listing listing : listings.values()) {
            if (listing.getItemId() == itemId && listing.getStatus() == Status.ACTIVE) {
                throw new IllegalArgumentException("Предмет уже выставлен на продажу!");
            }
        }
        Listing listing = new Listing(listingId, itemId, sellerId, price);
        listings.put(listingId, listing);
    }

    public void buyItem(long listingId, long buyerId) {
        Listing listing = listings.get(listingId);
        if (listing == null) {
            throw new IllegalArgumentException("Объявление с таким ID не найдено!");
        }
        Player buyer = players.get(buyerId);
        if (buyer == null) {
            throw new IllegalArgumentException("Покупатель с таким ID не зарегистрирован!");
        }
        if (listing.getStatus() != Status.ACTIVE) {
            throw new IllegalArgumentException("Покупка запрещена!");
        }
        Player seller = players.get(listing.getSellerId());
        if (listing.getSellerId() == buyer.getId()) {
            throw new IllegalArgumentException("Нельзя купить собственный предмет!");
        }
        Item item = items.get(listing.getItemId());
        if (item == null) {
            throw new IllegalArgumentException("Предмет с таким ID не найден!");
        }
        if (item.getOwnerId() != seller.getId()) {
            throw new IllegalArgumentException("Предмет больше не принадлежит продавцу!");
        }
        if (buyer.getBalance() < listing.getPrice()) {
            throw new IllegalArgumentException("Недостаточно средств для покупки предмета!");
        }
        if (seller != null) {
            throw new IllegalArgumentException("Продавца не существует!");
        }
        buyer.withdraw(listing.getPrice());
        seller.deposit(listing.getPrice());
        listing.setStatus(Status.SOLD);
        item.setOwnerId(buyerId);
        seller.removeItem(item);
        buyer.addItem(item);
    }

    public void cancelListing(long listingId, long sellerId) {
        Listing listing = listings.get(listingId);
        if (listing == null) {
            throw new IllegalArgumentException("Объявление с таким ID не найдено!");
        }
        if (listing.getSellerId() != sellerId) {
            throw new IllegalArgumentException("Отличие продавца от владельца!");
        }
        if (listing.getStatus() == Status.SOLD) {
            throw new IllegalArgumentException("Объявление снято с продажи!");
        }
        if (listing.getStatus() == Status.CANCELLED) {
            throw new IllegalArgumentException("Объявление было отменено!");
        }
        listing.setStatus(Status.CANCELLED);
    }

    public List<Listing> filterActiveListings(Category category, long minPrice, long maxPrice) {
        if (minPrice < 0 || maxPrice < minPrice) {
            throw new IllegalArgumentException("Некорректный ценовой диапазон!");
        }
        return listings.values().stream()
                .filter(listing -> listing.getStatus() == Status.ACTIVE)
                .filter(listing -> {
                    Item item = items.get(listing.getItemId());
                    if (item == null) {
                        return false;
                    }
                    return item.getCategory() == category;
                })
                .filter(listing -> listing.getPrice() >= minPrice && listing.getPrice() <= maxPrice)
                .toList();
    }
    public List<Listing> filterMinMaxRarity(Rarity rarity, long minPrice, long maxPrice) {
        if (minPrice < 0 || maxPrice < minPrice) {
            throw new IllegalArgumentException("Некорректный ценовой диапазон!");
        }
        return listings.values().stream()
                .filter(listing -> listing.getStatus() == Status.ACTIVE)
                .filter(listing -> {
                    Item item = items.get(listing.getItemId());
                    if (item == null) {
                        return false;
                    }
                    return item.getRarity() == rarity;
                    })
                .toList();
    }
}


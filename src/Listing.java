class Listing {
    private final long id;
    private long itemId;
    private long sellerId;
    private long price;
    private Status status;

    public Listing (long id, long itemId, long sellerId, long price) {
        this.id = id;
        this.itemId = itemId;
        this.sellerId = sellerId;
        this.price = price;
        this.status = Status.ACTIVE;
    }
    public void setStatus (Status status) {
        this.status = status;
    }
    public long getId() {return id;}
    public long getItemId() {return itemId;}
    public long getSellerId() {return sellerId;}
    public long getPrice() {return  price;}
    public Status getStatus() {return status;}
}
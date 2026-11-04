class Item {
    private final long id;
    private String name;
    private Category category;
    private Rarity rarity;
    private long ownerId;

    public Item(long id, String name, Category category, Rarity rarity, long ownerId){
        this.id = id;
        this.name = name;
        this.category = category;
        this.rarity = rarity;
        this.ownerId = ownerId;
    }
    public void setOwnerId(long ownerId){
        this.ownerId = ownerId;
    }
    public long getId() {return id;}
    public String getName() {return name;}
    public Category getCategory() {return category;}
    public Rarity getRarity() {return rarity;}
    public long getOwnerId() {return ownerId;}

}
public abstract class Asset {
    String name;
    int price;
    public Asset(String name, int price) {
        this.name = name;
        this.price = price;
    }
    String getName() {return this.name;}
    int getPrice() {return this.price;}
}

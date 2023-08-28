public class Computer extends TangibleAsset {
    String makerName;
    public Computer(String name, int price, String color, String makerName) {
        super(name, price, color);  //間違い
        this.makerName = makerName;
    }
    public String getIsbn() {return this.makerName;}
}

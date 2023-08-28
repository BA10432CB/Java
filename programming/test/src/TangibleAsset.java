public abstract class TangibleAsset extends Asset implements Thing {
    String color;
    double weight;
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight() {
        return this.weight;
    }
    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }
    String getColor() {return this.color;}

}

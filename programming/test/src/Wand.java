public class Wand {
    private String name;
    private double power;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if (name == null || name.length() <= 2) {
            throw new IllegalArgumentException("名前を3文字以上で指定してください");
        }
        this.name = name;
    }
    public double getPower() {
        return this.power;
    }
    public void setPower(double power) {
        if (power < 0.5 || power >100.0) {
            throw new IllegalArgumentException("増幅率を0.5~100に設定してください");
        }
        this.power = power;
    }
}

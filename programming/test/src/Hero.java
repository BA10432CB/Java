public class Hero {
    private int hp;
    private String name;
    Sword sword;
    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        // if (name == null) {
        //     throw new IllegalArgumentException("名前がnullである為中断");
        // }
        // if (name.length() <= 1) {
        //     throw new IllegalArgumentException("名前が短すぎる為中断");
        // }
        // if (name.length() >= 8) {
        //     throw new IllegalArgumentException("名前が長すぎる為中断");
        // }
        this.name = name;
    }
    public String toString() { //toString()をオーバーライド
        return "名前：" + this.name + "/ HP：" + this.hp;
    }
    // public void bye() {
    //     System.out.println("勇者は別れを告げた");
    // }
    // private void die() {
    //     System.out.println(this.name + "は死んでしまった");
    //     System.out.println("GAME OVERです");
    // }
    // public void sleep() {
    //     this.hp += 100;
    //     System.out.println(this.name + "は、眠って回復した");
    // }
    // public void attack(Matango m) {
    //     System.out.println(this.name + "の攻撃");
    //     m.hp -= 5;
    //     System.out.println("敵に5ポイントのダメージ");
    // }
}
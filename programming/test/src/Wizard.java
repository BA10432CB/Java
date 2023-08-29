public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    public int getHp() {
        return this.hp;
    }
    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }
    public int getMp() {
        return this.mp;
    }
    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("MPを1以上の整数で設定してください");
        }
        this.mp = mp;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if (name == null || name.length() <= 2) {
            throw new IllegalArgumentException("名前を3文字以上で指定してください");
        }
        this.name = name;
    }
    public Wand getWand() {
        return this.wand;
    }
    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("杖を装備していないと魔法は使えません");
        }
        this.wand = wand;
    }
    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int)(basePoint * this.getWand().getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");
    }
    // int mp;
    // public void attack(Matango m) {
    //     System.out.println(this.name + "の攻撃");
    //     System.out.println("敵に3ポイントのダメージ");
    //     m.hp -= 3;
    // }
    // public void fireball(Matango m) {
    //     System.out.println(this.name + "は火の玉を放った");
    //     System.out.println("敵に20ポイントのダメージ");
    //     m.hp -= 20;
    //     this.mp -= 5;
    // }
    // // public void heal(Hero h) {
    // //     h.hp += 10;
    // //     System.out.println(h.name + "のHPを10回復した！");
    // // }
}

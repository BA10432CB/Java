public class Hero {
    String name = "ミナト";
    int hp = 100;
    // Sword sword;
    public void attack(Matango m) {
        System.out.println("this.name" + "の、攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージをあたえた！");
    }
    // public void sleep() {
    //     this.hp = 100;
    //     System.out.println(this.name + "は、眠って回復した！");
    // }
    // public void sit(int sec) {
    //     this.hp += sec;
    //     System.out.println(this.name + "は、" + sec + "秒座った！");
    //     System.out.println("HPが" + sec + "ポイント回復した");
    // }
    public final void slip() {
        this.hp -= 5;
        System.out.println(this.name + "は転んだ！");
        System.out.println("5のダメージ！");
    }
    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }
    // public Hero(String name) {
    //     this.hp = 100;
    //     this.name = name;
    // }
    // public Hero() {
    //     this("ダミー");
    // }
    public Hero() {
        System.out.println("Heroのコンストラクタが動作");
    }
}
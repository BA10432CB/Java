public class Cleric {
    String name;
    int hp = 50;
    final int HP_MAX = 50;
    int mp = 10;
    final int MP_MAX = 10;

    public void selfAid() {
        System.out.println(this.name + "は、セルフエイドを唱えた！");
        this.hp = HP_MAX;
        this.mp -= 5;
        System.out.println(this.name + "のHPは、最大まで回復した！");
    }
    public int pray(int sec) {
        System.out.println(this.name + "は" + sec + "秒間天に祈った！");
        int mpRecover = new java.util.Random().nextInt(3) + sec;
        int mpRecoverActual = Math.min(this.MP_MAX - this.mp, mpRecover);
        this.mp += mpRecoverActual;
        System.out.println("MPが" + mpRecoverActual + "回復した！");
        return mpRecoverActual;
    }
}

public class Main9 {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        Hero h1 = new Hero("ミナト");
        h1.sword = s;
        System.out.println("現在の武器は" + h1.sword.name);

        Hero h2 = new Hero("アサカ");
        Wizard w = new Wizard("スガワラ");
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
    }
}

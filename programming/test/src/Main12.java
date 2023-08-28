public class Main12 {
    public static void main(String[] args) {
        Character c = new Wizard();
        if (c instanceof Wizard) {
            Wizard w = (Wizard)c;
        }
        Matango m = new Matango();
        c.name = "アサカ";
        c.attack(m);
        // c.fireball(m); これはCharacterクラスに宣言していないため使えない
        Slime s = new Slime();
        Monster mo = new Slime();
        s.run();
        mo.run();
    }
}

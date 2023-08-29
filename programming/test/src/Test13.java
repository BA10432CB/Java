public class Test13 {
    public static void main(String[] args) {
        Wizard w = new Wizard();
        Hero h = new Hero();
        h.setName("ミナト");
        h.setHp(100);
        w.heal(h);
    }
}

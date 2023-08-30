public class Main14 {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.setHp(100);
        h1.setName("ミナト");
        System.out.println(h1.toString());
        Hero h2 = new Hero();
        h2.setHp(200);
        h2.setName("強ミナト");
        System.out.println(h2.toString());
        if (h1.equals(h2) == true) {
            System.out.println("ミナトはパワーアップした");
        } else {
            System.out.println("パワーアップするには経験値が足りません");   
        }
    }
}

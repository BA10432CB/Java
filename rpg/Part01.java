public class Part01 {
    public static void main(String[] args) {
        String name = "ミナト";
        int level = 80;
        putOpening(name, level);
        putBattle(name, level);
    }

    static void putOpening(String name, int level) {
        System.out.println("魔王が世界を滅ぼそうとしています。");
        System.out.println(name + "は魔王討伐の旅に出ました。");
        System.out.println(name + "はレベル" + level + "になりました。");
    }
    
    static void putBattle(String name, int level) {
        if (level < 50) {
            System.out.println(name + "は魔王に敗北しました。");
            System.out.println("GAME OVER...");
        } else if (level >= 50 && level <70) {
            System.out.println(name + "は魔王を倒しました！");
            System.out.println("GAME CLEAR!");
        } else {

            System.out.println(name + "は魔王軍を全滅させました！");
            System.out.println("GAME CLEAR!!");
        }
    }
}
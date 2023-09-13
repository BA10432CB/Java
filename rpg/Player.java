public class Player {
    static String name = "ミナト";    //プレイヤーの名前
    static int level = 40;            //プレイヤーのレベル
    static int hp = 40;               //プレイヤーのHP
    static int gold = 50;             //プレイヤーの所持金
    public static String getStatus() {
        return("　" + name + "　LV：" + level + "　HP：" + hp + "　所持金：" + gold);
    }
}

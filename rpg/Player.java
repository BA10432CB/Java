public class Player {
    String name;    //プレイヤーの名前
    int level;            //プレイヤーのレベル
    int hp;               //プレイヤーのHP
    int gold;             //プレイヤーの所持金
    
    public Player() {
        name = "ミナト";
        level = 40;
        hp = 40;
        gold = 50;
    }
    
    public String getStatus() {
        return("　" + name + "　LV：" + level + "　HP：" + hp + "　所持金：" + gold);
    }
}

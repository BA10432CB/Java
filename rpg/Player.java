import javax.swing.JLabel;
public class Player {
    String name;          //プレイヤーの名前
    private int level;    //プレイヤーのレベル
    private int hp;               //プレイヤーのHP
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
    
    public int getLevel() {  //アクセス修飾子
        return level;
    }

    public void setLevel(JLabel jl, int a) {  //アクセス修飾子
        level = a;
        if (getLevel() > 100) {
            setLevel(jl, 100);
        }
        jl.setText(getStatus());
    }

    public int getHp() {
        return hp;
    }

    public void setHp(JLabel jl, int a) {
        hp = a;
        jl.setText(getStatus());
    }
}

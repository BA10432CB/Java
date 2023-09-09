public class Part01 {
    static String name = "ミナト";    //プレイヤーの名前
    static int level = 40;            //プレイヤーのレベル
    static int hp = 40;               //プレイヤーのHP
    static int gold = 50;             //プレイヤーの所持金
    public static void main(String[] args) throws java.io.IOException {
        putOpening();   //序章画面を表示
        putCommand();
        if (hp == 0) {
            return; //これより下の処理は実行せずに自分の関数に戻る
        }
        putBattle();    //最終決戦後の結果を表示
    }
    /**
     * 序章画面の表示
     * @param name　プレイヤーの名前
     * @param level　プレイヤーのレベル
     */
    public static void putOpening() {
        put("魔王が世界を滅ぼそうとしています。");
        put(name + "は魔王討伐の旅に出ようとしています。");
    }
    /**
     * 選択肢表示
     * @throws java.io.IOException
     */
    public static void putCommand() throws java.io.IOException {
        put("どうする？");
        put("1．魔王を倒しに行く。(現在のLV：" + level + ")");
        put("2．修行する。(現在のHP：" + hp + ")");
        put("3．宿屋に泊まる。(現在の所持金：" + gold + " G)"); 
        switch(inputCommand()) {
            case '1': {
                put("魔王が現れた！");
                break;
            }
            case '2': {
                training();
                break;
            }
            case '3': {
                if (gold >= 10) {
                    hp = level;
                    gold -= 10;
                    put("HPが全回復した。");
                } else {
                    put("所持金が足りません。");
                }
                putCommand();
                break;
            }
        }
    }
    /**
     * 修行
     * @throws java.io.IOException
     */
    public static void training() throws java.io.IOException {
        java.util.Random r = new java.util.Random();
        //敵が出現する
        int enemy = r.nextInt(4) + 1;
        put("敵が" + enemy + "体現れた！");
        int i = 0; //敵を出現させる
        while (i < enemy) {
            System.out.print(" (；ﾟДﾟ) ");
            i += 1;
        }
        put("");
        int d = r.nextInt(4) + 1; //修行の際に受けるダメージのランダム1~4
        if (hp > d) {
            if (level < 100){
                receiveDamage(d);
                level += enemy;
                if (level > 100) {
                    level = 100;
                }
                put(name + "はレベル" + level + "になりました。");
                putCommand();
            } else if (level == 100) {
                put("ミナトは強くなりすぎたので、魔王討伐に向かいました");
                put("魔王が現れた！");
            }
        } else {
            put(name + "は疲れて修行できなかった。");
            putCommand();
        }
    }
    //intにすると戻り値の型を指定 =>　変数に代入することができる
    public static int inputCommand() throws java.io.IOException {
        int c = System.in.read(); //文字コードを取得
        if (c == 10 || c == 13) { //crlfを排除(改行と先頭に戻す動作)
            return (inputCommand());
        } else {
            return (c);
        }
    }
    /**
     * 最終決戦後の結果を表示
     * @param name　プレイヤーの名前
     * @param level　プレイヤーのレベル
     */
    public static void putBattle() {
        status();
        put("魔王の攻撃！");
        int d = 60;
        receiveDamage(d);
        if (hp < 0) {
            hp = 0;
            put(name + "は力尽きた...。");
            put("魔王に敗北しました。");
            put("GAME OVER...");
        } else {
            put(name + "の攻撃！");
            put(name + "は魔王を倒しました！");
            put("GAME CLEAR!!");
        }
    }
    public static void status() {
        put("------------------------------");
        put("　" + name + "　LV：" + level + "　HP：" + hp);
        put("------------------------------");
    }
    /**
     * ダメージ表示
     * @param d　受けたダメージ
     */
    public static void receiveDamage(int damage) {
        hp -= damage;
        put(name + "は" + damage + "のダメージを受けた。");
    }
    /**
     * 出力の簡潔化
     * @param str   文章の引数
     */
    public static void put(String str) {
        System.out.println(str); //改行が必要ないところはprintで使用する
    }
}
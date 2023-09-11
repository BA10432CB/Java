public class Console {
    /**
     * 序章画面の表示
     * @param Player.name　プレイヤーの名前
     * @param Player.level　プレイヤーのレベル
     */
    public static void putOpening() {
        Part01.put("魔王が世界を滅ぼそうとしています。");
        Part01.put(Player.name + "は魔王討伐の旅に出ようとしています。");
    }

    /**
     * 選択肢表示
     * @throws java.io.IOException
     */
    public static void putCommand() throws java.io.IOException {
        Part01.put("どうする？");
        Part01.put("1．魔王を倒しに行く。(現在のLV：" + Player.level + ")");
        Part01.put("2．修行する。(現在のHP：" + Player.hp + ")");
        Part01.put("3．宿屋に泊まる。(現在の所持金：" + Player.gold + " G)"); 
        switch(inputCommand()) {
            case '1': {
                Part01.put("魔王が現れた！");
                break;
            }
            case '2': {
                training();
                break;
            }
            case '3': {
                if (Player.gold >= 10) {
                    Player.hp = Player.level;
                    Player.gold -= 10;
                    Part01.put("HPが全回復した。");
                } else {
                    Part01.put("所持金が足りません。");
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
        Part01.put("敵が" + enemy + "体現れた！");
        int i = 0; //敵を出現させる
        while (i < enemy) {
            System.out.print(" (；ﾟДﾟ) ");
            i += 1;
        }
        Part01.put("");
        int d = r.nextInt(4) + 1; //修行の際に受けるダメージのランダム1~4
        if (Player.hp > d) {
            if (Player.level < 100){
                receiveDamage(d);
                Player.level += enemy;
                if (Player.level > 100) {
                    Player.level = 100;
                }
                Part01.put(Player.name + "はレベル" + Player.level + "になりました。");
                putCommand();
            } else if (Player.level == 100) {
                Part01.put("ミナトは強くなりすぎたので、魔王討伐に向かいました");
                Part01.put("魔王が現れた！");
            }
        } else {
            Part01.put(Player.name + "は疲れて修行できなかった。");
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
     * @param Player.name　プレイヤーの名前
     * @param Player.level　プレイヤーのレベル
     */
    public static void putBattle() {
        putStatus();
        Part01.put("魔王の攻撃！");
        int d = 60;
        receiveDamage(d);
        if (Player.hp < 0) {
            Player.hp = 0;
            Part01.put(Player.name + "は力尽きた...。");
            Part01.put("魔王に敗北しました。");
            Part01.put("GAME OVER...");
        } else {
            Part01.put(Player.name + "の攻撃！");
            Part01.put(Player.name + "は魔王を倒しました！");
            Part01.put("GAME CLEAR!!");
        }
    }
    public static void putStatus() {
        Part01.put("------------------------------");
        Part01.put(Player.getStatus());
        Part01.put("------------------------------");
    }

    /**
     * ダメージ表示
     * @param d　受けたダメージ
     */
    public static void receiveDamage(int damage) {
        Player.hp -= damage;
        Part01.put(Player.name + "は" + damage + "のダメージを受けた。");
    }
}

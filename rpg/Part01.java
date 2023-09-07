public class Part01 {
    static String name = "ミナト";    //プレイヤーの名前
    static int level = 40;            //プレイヤーのレベル
    static int hp = 40;               //プレイヤーのHP
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

    public static void putCommand() throws java.io.IOException {
        put("どうする？");
        put("1．魔王を倒しに行く。");
        put("2．修行する。(現在のHP：" + hp + ")");
        put("3．宿屋に泊まる");
        int c = inputCommand(); 
        if ( c == '1') {
            put("魔王が現れた！");
            put(name + "はレベル" + level + "です。");
        } else if (c == '2') {
            if (hp > 3) {
                if (level <= 95){
                    level += 5;
                    hp -= 3;
                    put(name + "はレベル" + level + "になりました。");
                    putCommand();
                } else {
                    level = 100;
                    hp -= 3;
                    put(name + "はレベル" + level + "になりました。");
                } 
            } else {
                put(name + "は疲れて修行できなかった。");
                putCommand();
            }
        } else if (c == '3') {
            hp = level;
            put("HPが全回復した。");
            putCommand();
        }
    }
    //intにすると戻り値の型を指定 =>　変数に代入することができる
    public static int inputCommand() throws java.io.IOException {
        int c = System.in.read(); //文字コードを取得
        if (c == 10 || c == 13) {
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
        put("魔王の攻撃！");
        hp -= 60;
        put(name + "は60のダメージを受けた。");
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
    /**
     * 出力の簡潔化
     * @param str   文章の引数
     */
    public static void put(String str) {
        System.out.println(str); //改行が必要ないところはprintで使用する
    }
    /**
     * 選択肢の表示
     * @param name
     * @param level
     * @throws java.io.IOException
     */
}
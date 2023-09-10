public class Part01 {
    static String name = "ミナト";    //プレイヤーの名前
    static int level = 40;            //プレイヤーのレベル
    static int hp = 40;               //プレイヤーのHP
    static int gold = 50;             //プレイヤーの所持金
    public static void main(String[] args) throws java.io.IOException {
        Console.putOpening();   //序章画面を表示
        Console.putCommand();
        if (hp == 0) {
            return; //これより下の処理は実行せずに自分の関数に戻る
        }
        Console.putBattle();    //最終決戦後の結果を表示
    }
    /**
     * 出力の簡潔化
     * @param str   文章の引数
     */
    public static void put(String str) {
        System.out.println(str); //改行が必要ないところはprintで使用する
    }
}
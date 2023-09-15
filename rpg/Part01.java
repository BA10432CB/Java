public class Part01 {
    Player m_player;
    public void main(String[] args) throws java.io.IOException {
        m_player = new Player();
        // Console.putOpening();   //序章画面を表示
        // Console.putCommand();
        if (m_player.getHp() == 0) {
            return; //これより下の処理は実行せずに自分の関数に戻る
        }
        // Console.putBattle();    //最終決戦後の結果を表示
    }
    /**
     * 出力の簡潔化
     * @param str   文章の引数
     */
    public static void put(String str) {
        System.out.println(str); //改行が必要ないところはprintで使用する
    }

    // /**
    //  * ダメージ表示
    //  * @param d　受けたダメージ
    //  */
    // public void receiveDamage(int damage) {
    //     m_player.hp -= damage;
    //     // Part01.put(Player.name + "は" + damage + "のダメージを受けた。");
    // }
}
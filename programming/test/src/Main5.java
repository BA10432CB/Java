public class Main5 {
    // メソッドの呼び出し
    public static void main(String[] args) {
        System.out.println("呼び出し");
        hello("タナカ"); //最終的にはここで
        hello("ヤマモト");
        int ans = add(100, 10);
        System.out.println("100 + 10 =" + ans);
        // 戻り値をそのまま使う
        System.out.println(add(add(10, 20), add(30, 40)));
        // オーバーロード
        System.out.println(add(10, 20));
        System.out.println(add(1.5, 2.2)); //　引数の型が異なる場合引数を見て区別される
        System.out.println(add("x", "y"));
        System.out.println(add(10, 20, 30)); //引数の個数違いも区別される
        // 引数に配列を用いる
        int[] array = {1, 2, 3};
        printArray(array);
        // 参照渡し↑のarrayをiceArrayで上書きしているので以降array={2, 3, 4}になってる
        iceArray(array);
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println(array[0]);
        // 戻り値に配列を用いる
        int[] make = makeArray(3);
        for (int i : make) {
            System.out.println(i);
        }
        System.out.println("呼び出し終了");
    }
    public static void hello(String name) { //引数を宣言する際に型も同時に宣言する
        System.out.println(name + "さん、こんにちは");
        goodMornig(); //main以外のメソッドで呼び出す。
    }
    public static void goodMornig() {
        System.out.println("おはよう");
    }
    public static int add(int x, int y) {
        int ans = x + y;
        return ans; //メソッドを終了させる
    }
    public static double add(double x, double y) {
        return x + y;
    }
    public static String add(String x, String y) {
        return x + y;
    }
    public static int add(int x, int y, int z) {
        return x * y * z;
    }
    // 引数や戻り値に配列を用いる
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
    public static void iceArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }
    public static int[] makeArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }
}

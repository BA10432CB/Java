public class Main4 {
    // public static void main(String[] args) {
    //     int[] scores = {30, 40, 50, 60, 90};
    //     int num = scores.length;
    //     int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
    //     int avg = sum / num;
    //     System.out.println("合計点：" + sum);
    //     System.out.println("平均点：" + avg);
    //     for(int i = 0; i < num; i++) {
    //         System.out.println(scores[i]);
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] scores = {30, 40, 50, 60, 90};
    //     int sum = 0;
    //     int count = 0;
    //     for (int value : scores) {
    //         System.out.println(value);
    //     }
        //     sum += scores[i];
        //     if (scores[i] >= 50) {
        //         count++;
        //     }
        // }
        // int avg = sum / scores.length;
        // System.out.println("合計点：" + sum);
        // System.out.println("平均点：" + avg);
        // System.out.println("50点以上の科目数：" + count);
    // }

    // public static void main(String[] args) {
    //     int[] seq = new int[10];

    //     for(int i = 0; i < seq.length; i++) {
    //         seq[i] = new java.util.Random().nextInt(4);
    //     }

    //     for (int i = 0; i < seq.length; i++) {
    //         // switch (seq[i]) {
    //         //     case 0:
    //         //         System.out.print("A");
    //         //         break;
    //         //     case 1:
    //         //         System.out.print("T");
    //         //         break;
    //         //     case 2:
    //         //         System.out.print("G");
    //         //         break;
    //         //     case 3:
    //         //         System.out.print("C");
    //         //         break;
    //         // }
    //         char[] base = {'A', 'T', 'G', 'C'};
    //         System.out.print(base[seq[i]] + " ");
    //     }
    // }
    // public static void main(String[] args) {
    //     int[] array = {1, 2, 3};
    //     array = null;
    //     array[0] = 10;
    // }
    public static void main(String[] args) {
        int[] [] scores = {{40, 50, 60}, {80, 60, 70}};
        System.out.println(scores.length);
        System.out.println(scores[0].length);
    }
}

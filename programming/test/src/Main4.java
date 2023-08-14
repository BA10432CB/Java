public class Main4 {
    public static void main(String[] args) {
        int[] scores = {30, 40, 50, 60, 90};
        int num = scores.length;
        int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
        int avg = sum / num;
        System.out.println("合計点：" + sum);
        System.out.println("平均点：" + avg);
    }
}

public class Test4 {
    public static void main(String[] args) {
        int[] points = new int[4];
        double[] weights = new double[5];
        boolean[] ansewers = new boolean[3];
        String[] names = new String[3];

        int[] moneyList = {121902, 8302, 55100};
        for (int i = 0; i < 3; i++) {
            System.out.println(moneyList[i]);
        }
        // 拡張for
        for (int lists : moneyList) {
            System.out.println(lists);
        }

        int[] numbers = {3, 4, 9};
        System.out.println("１桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for (int j = 0; j < 3; j++){
            if (input == numbers[j]) {
                System.out.println("アタリ！");
            } 
        }
    }
    
}

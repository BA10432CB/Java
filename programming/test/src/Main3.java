public class Main3 {
    public static void main(String[] args) {
        boolean tenki = false;
        if (tenki == true) {
            System.out.println("洗濯をします");
            System.out.println("散歩をします");
        } else {
            System.out.println("DVDを見ます");
        }

        boolean doorClose = false;
        while (doorClose == true) {
            System.out.println("ノックする");
            System.out.println("1分待つ");
        }

        System.out.println("ようこそ占いの館へ");
        int fortune = new java.util.Random().nextInt(5) + 1;
        switch(fortune) {
            case 1:
                System.out.println("大吉");
                break;
            case 2:
            case 3:
                System.out.println("中吉");
                break;
            case 4:
                System.out.println("吉");
                break;
            default:
                System.out.println("凶");
        }

        for (int i = 1; i < 10; i++) {
            if (i == 3) {
                continue;
            }
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

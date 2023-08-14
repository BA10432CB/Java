public class Main2 {
	public static void main(String[] args){
		String name = "すがわら";
		String message;
		message = name + "さん、こんにちは";
		System.out.println(message);
		System.out.print(name);
		System.out.print("さん、こんにちは");

		int a = 5;
		int b = 3;
		int m = Math.max(a, b);
		System.out.println("比較実験：" + a + "と" + b + "とで大きいほうは" + m);

		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");

		int r = new java.util.Random().nextInt(90);
		System.out.println(r);

		System.out.println("あなたの名前を入力してください");
		String nm = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		int ag = new java.util.Scanner(System.in).nextInt();
		System.out.println("名前：" + nm + ",年齢：" + ag);
	}
}
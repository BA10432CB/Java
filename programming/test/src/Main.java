public class Main {
	public static void main(String[] args) {
		int age = 20; //finalで変数定義をすると下のageで再代入できないVScodeだとコンパイルすらできない
		System.out.println("私の年齢は" + age);
		age = 31;
		System.out.println("本当の年齢は" + age);
	}
}
public class Test5 {
    public static void main(String[] args) {
        introduceOneself();
        email("おはよう", "sample@sample.com", "皆さんおはようございます");
        email("sample@sample.com", "皆さんおはようございます");
        double triangleArea = calcTriangleArea(12.5, 22.8);
        double circleArea = calcCircleArea(10.0);
        System.out.println(triangleArea + ":" + circleArea);
    }
    public static void introduceOneself() {
        String name = "タナカ";
        int age = 27;
        float tall = 167.2F;
        char zodiac = '猪';
        System.out.println(name + "です。" + "年齢は" + age + "歳で、身長は" + tall + "cmあります。" + "干支は" + zodiac + "です。");
    }
    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }
    public static void email(String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文：" + text);
    }
    public static double calcTriangleArea(double bottom, double height) {
        return bottom * height * 0.5;
    }
    public static double calcCircleArea(double radius) {
        return radius * radius * 3.14;
    }
}

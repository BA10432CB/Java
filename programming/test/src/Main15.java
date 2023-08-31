public class Main15 {
    public static void main(String[] args) {
        String s1 = "スッキリJava";
        String s2 = "Java";
        String s3 = "java";
        if (s2.equals(s3)) {
            System.out.println("s2=s3");
        }
        if (s2.equalsIgnoreCase(s3)) {
            System.out.println("s2 is near s3");
        }
        System.out.println("s1の文字数：" + s1.length());
        if (s1.isEmpty()) {
            System.out.println("s1 is null");
        }
        String s4 = "Java and JavaScript";
        if (s4.contains(s2)) {
            System.out.println("s4 contains s2");
        }
        if (s4.endsWith(s2)) {
            System.out.println("There is s2 end of s4");
        }
        System.out.println(s4.indexOf(s2));
        System.out.println(s4.lastIndexOf(s2));
        String s5 = "Java programming";
        System.out.println(s5.charAt(6));
        System.out.println(s5.substring(3));
        System.out.println(s5.substring(3, 8));
        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());
        System.out.println(s5.replace("Java", "JAVA"));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append("Java");
        }
        String s = sb.toString();
        System.out.println(s);

        Hero h = new Hero();
        h.setName("BBBB0123");
        System.out.println(h.isValidPlayerName(h.getName()));
        
        String st = "Java";
        System.out.println(st.matches("java"));
        System.out.println(st.matches("Ja.a"));
        System.out.println("Jaaaaaava".matches("Ja*va"));
        System.out.println("jajajtexxjajaja".matches(".*"));
    }
}

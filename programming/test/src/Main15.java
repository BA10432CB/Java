import java.util.Date;
import java.util.Calendar;
import java.time.*;
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

        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < 5; i++) {
        //     sb.append("Java");
        // }
        // String s = sb.toString();
        // System.out.println(s);

        Hero h = new Hero();
        h.setName("BBBB0123");
        System.out.println(h.isValidPlayerName(h.getName()));
        
        String st = "Java";
        System.out.println(st.matches("java"));
        System.out.println(st.matches("Ja.a"));
        System.out.println("Jaaaaaava".matches("Ja*va"));
        System.out.println("jajajtexxjajaja".matches(".*"));

        final String FORMAT = "%-9s %-13s 所持金%, 6d";
        h.setJob("Knight");
        h.setGold(5000);
        String s = String.format(FORMAT, h.getName(), h.getJob(), h.getGold());
        System.out.println(s);

        //　処理時間の計測
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50; i++) {
            System.out.println(i + 1);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        // Date now = new Date();
        // System.out.println(now);
        // System.out.println(now.getTime());
        // Date past = new Date(1600705425827L);
        // System.out.println(past);

        Calendar c = Calendar.getInstance();
        c.set(2019, 8, 22, 1, 23, 45);
        c.set(Calendar.MONTH, 9);
        Date d = c.getTime();
        System.out.println(d);
        Date now = new Date();
        c.setTime(now);
        int y = c.get(Calendar.YEAR);
        System.out.println(y);

        Instant i1 = Instant.now();
        Instant i2 = Instant.ofEpochMilli(1600705425827L);
        long l = i2.toEpochMilli();
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l);

        ZonedDateTime z1 = ZonedDateTime.now();
        ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
        System.out.println(z2.getYear() + "z2.getMonth()" + z2.getDayOfMonth());
    }
}

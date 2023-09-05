import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Calendar;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Test15 {
    public static void main(String[] args) {
        //練習1
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 101; i++) {
            sb.append(i + ",");
        }
        String s = sb.toString();
        System.out.println(s);
        String a[] = s.split(",");
        System.out.println(Arrays.toString(a));
        //練習2
        // String folder = new String();
        // String file = new String();
        // final String PASS;
        // if (folder.endsWith("\\")) {
        //     PASS = String.format("%s%s", folder, file);
        // } else {
        //     PASS = String.format("%s\\%s", folder, file);
        // }
        // System.out.println(PASS);
        //訂正
        // public String concatPath(String folder, String file) {
        //     if (!folder.endsWith("\\")) {
        //         folder += "\\";
        //     }
        //     return folder + file;
        // }
        //練習3
        // .*
        // A\d[1,2]
        // U[A~Z]{3}
        //練習4
        Date d = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int day = c.get(Calendar.DAY_OF_MONTH);
        day += 100;
        c.set(Calendar.DAY_OF_MONTH, day);
        Date date = c.getTime();
        SimpleDateFormat fmt = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println("現在の100日後の日付：" + fmt.format(date));
        //練習5
        LocalDate loDate = LocalDate.now();
        LocalDate loDatePlus = loDate.plusDays(100);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        String str = loDatePlus.format(f);
        System.out.println("現在の100日後の日付：" + str);
    }
}

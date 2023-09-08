// import java.util.ArrayList;
import java.util.*;
class Name {
    public String name;
}
public class Main16 {
    public static void main(String[] args) {
        pointsControl();
        namesControl();
        colorsControl();
        wordsControl();
        populationControl();
        heroInfo();
    }

    public static void pointsControl() {
        ArrayList<Integer> points = new ArrayList<>();
        points.add(10);
        points.add(80);
        points.add(75);
        for (int i : points) {
            System.out.println(i);
        }
        System.out.println("0番目の要素：" + points.get(0));
        System.out.println("要素の数：" + points.size());
        System.out.println("要素数がゼロかどうか：" + points.isEmpty());
        points.set(0, 50);
        System.out.println("要素に50が含まれているか：" + points.contains(50));
        System.out.println("80の要素は何番目か：" + points.indexOf(80));
        points.add(66);
        System.out.println(points);
        points.remove(3);
        System.out.println(points);
        points.clear();
        System.out.println(points);
    }

    public static void namesControl() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("湊");
        names.add("朝香");
        names.add("菅原");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }
    }

    public static void colorsControl() {
        Set<String> colors = new HashSet<String>(); //順序は関係ない
        colors.add("赤");
        colors.add("青");
        colors.add("黄");
        colors.add("赤"); //重複は無視される
        System.out.println("色は" + colors.size() + "種類");
        for (String s : colors) {
            System.out.print(s + "→");
        }
        System.out.println();
    }

    public static void wordsControl() {
        Set<String> words = new TreeSet<String>(); //辞書順にでてくる
        words.add("cat");
        words.add("dog");
        words.add("bird");
        words.add("wolf");
        for (String w : words) {
            System.out.print(w + ",");
        }
        System.out.println();
    }

    public static void populationControl() {
        Map<String, Integer> prefs = new HashMap<String, Integer>();
        prefs.put("京都府", 255);
        prefs.put("東京都", 1261);
        prefs.put("熊本県", 181);
        int tokyo = prefs.get("東京都");
        System.out.println("東京都の人口は、" + tokyo);
        prefs.put("熊本県", 182);
        int kumamoto = prefs.get("熊本県");
        System.out.println("熊本県の人口は、" + kumamoto);
        for (String key : prefs.keySet()) {
            int value = prefs.get(key);
            System.out.println(key + "の人口は、" + value);
        }
    }

    public static void heroInfo() {
        Name h = new Name();
        h.name = "ミナト";
        List<Name> list = new ArrayList<Name>();
        list.add(h);
        h.name = "スガワラ";
        System.out.println(list.get(0).name);
    }
}
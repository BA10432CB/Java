import javax.swing.*;   //JFrame,JLabel,JPanel
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
public class Part18 {
    public static void main(String[] args) throws IOException {
        JFrame jf = new JFrame();                                       //JFrameクラスのインスタンスを生成する
        jf.setBounds(100, 80, 1100, 700);               //初期状態のWindowの配置と大きさを指定する(x, y, width, height)
        jf.setVisible(true);                                          //JFrameのWindowを表示
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);              //JFrameの×を押した際にプログラムを止める為の指示
    
        JPanel jp = new JPanel(new GridLayout(3, 1, 0, 0)); //行列を指定
        jp.setBackground(Color.WHITE);                                  //背景色を指定
        jf.add(jp);
        
        //レイアウト1行目
        JPanel jpChild1 = new JPanel();
        jpChild1.setBackground(Color.BLUE);                               //背景色を指定
        jp.add(jpChild1);
        JLabel jl = new JLabel(Console.getStatus()); //JFrame上に出力するインスタンスを生成
        jl.setFont(new Font(Font.SERIF, 0, 50));             //Font種類大きさなどの設定
        jl.setForeground(new Color(255, 128, 0));                 //文字の色の指定 色の要素を指定するならインスタンスを生成する必要がある
        jpChild1.add(jl);                                                     //JFrame上のJPanelに出力
        
        //画像の挿入 96*96 レイアウト２行目
        JPanel jpChild2 = new JPanel();
        jpChild2.setBackground(Color.CYAN);                               //背景色を指定
        jp.add(jpChild2);
        File file = new File("pipo-charachip020.png");         //ファイルを開く
        BufferedImage bi = ImageIO.read(file);     
        int cw = 96; int ch = 96;                                       //画像全体を読み込む
        int sw = 200; int sh = 200;
        putMonster(2, 3, cw, ch, sw, sh, file, bi, jpChild2);
        putMonster(1, 2, cw, ch, sw, sh, file, bi, jpChild2);
        putMonster(0, 1, cw, ch, sw, sh, file, bi, jpChild2);
        JLabel jlMain = new JLabel("<html>1．魔王を倒しに行く。<br>2．修行する。<br>3．宿屋に泊まる。");
        jlMain.setFont(new Font(Font.SERIF, 0, 50));
        jpChild2.add(jlMain);
        
        //レイアウト３行目
        JPanel jpChild3 = new JPanel();
        jpChild3.setBackground(Color.BLUE);                               //背景色を指定
        jp.add(jpChild3);
        
        JLabel jlChild = new JLabel("魔王が世界を滅ぼそうとしています。");
        jlChild.setFont(new Font(Font.SERIF, 0, 50));
        jlChild.setForeground(Color.WHITE);
        jpChild3.add(jlChild);
    }

    /**
     * モンスターをセルから切り取って表示
     * @param x         基準のx座標
     * @param y         基準のy座標
     * @param cw        画像のx幅
     * @param ch        画像のy幅
     * @param file      参考にするfile名
     * @param bi        file名を読み込む
     * @param jp        表示される場所
     * @param sw        表示される幅
     * @param sh        表示される高さ
     */
    public static void putMonster(int x, int y, int cw, int ch, int sw, int sh, File file, BufferedImage bi, JPanel jpChild2) {
        BufferedImage biPart = bi.getSubimage(cw*x, ch*y, cw, ch);      //画像を切り抜き
        Image biPartReduction = biPart.getScaledInstance(sw, sh, Image.SCALE_DEFAULT);
        ImageIcon ii = new ImageIcon(biPartReduction);                  //JLabel用に画像を変換
        JLabel jlImage = new JLabel(ii);                                //画像の要素を生成
        jlImage.setSize(sw, sh);
        jpChild2.add(jlImage);
    }
}

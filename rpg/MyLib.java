import java.awt.*;
import java.awt.image.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyLib {
    /**
     * JPanelを作成し背景色を設定
     * @return
     */
    static JPanel createPanel(Color c) {
        JPanel jp = new JPanel();
        jp.setBackground(c);
        return(jp);
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
     * @param file      読み込むファイル名
     * @param bi        画像を切り抜き
     * @param jpChild2  
     */
    static void putMonster(int x, int y, int cw, int ch, int sw, int sh, BufferedImage bi, JPanel jpChild2) {
        BufferedImage biPart = bi.getSubimage(cw*x, ch*y, cw, ch);      //画像を切り抜き
        Image biPartReduction = biPart.getScaledInstance(sw, sh, Image.SCALE_DEFAULT);
        ImageIcon ii = new ImageIcon(biPartReduction);                  //JLabel用に画像を変換
        JLabel jlImage = new JLabel(ii);                                //画像の要素を生成
        jlImage.setSize(sw, sh);
        jpChild2.add(jlImage);
    }

    static void putImage(int x, int y, int cw, int ch, int sw, int sh, BufferedImage bi,  JPanel jpChild2) {
        BufferedImage biPart = bi.getSubimage(x, y, cw, ch);
        Image biPartReduction = biPart.getScaledInstance(sw, sh, Image.SCALE_DEFAULT);
        ImageIcon ii = new ImageIcon(biPartReduction);
        JLabel jlImage = new JLabel(ii);
        jlImage.setSize(sw, sh);
        jpChild2.add(jlImage);
    }
}

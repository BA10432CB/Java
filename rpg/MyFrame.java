import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;   //JFrame,JLabel,JPanel
import java.util.Random; 
public class MyFrame extends JFrame {                                           //JFrameクラスの継承
    JLabel jlMsg;
    JPanel jpChild2;
    BufferedImage bi;
    MyFrame() throws IOException {
        File file = new File("pipo-charachip020.png");                 //ファイルを開く
        bi = ImageIO.read(file);                                                //画像全体を読み込む
        //コンストラクタ化　ファイル名と同じ名前で定義する
        setBounds(100, 80, 1000, 600);                         //初期状態のWindowの配置と大きさを指定する(x, y, width, height)
        setDefaultCloseOperation(EXIT_ON_CLOSE);                                //JFrameの×を押した際にプログラムを止める為の指示
        add(createBasicPanel());
        setVisible(true); 

        enableEvents(java.awt.AWTEvent.KEY_EVENT_MASK);                         //キー入力有効化 ここでprocessKeyEvent()を呼び出す非同期 色々なEVENT_MASKあるから悩んだら見る
    }

    protected void processKeyEvent(KeyEvent e) {                                //キー受け取り・どのキーが押されたか判定
        if (e.getID() == KeyEvent.KEY_PRESSED ){
            System.out.println("キー" + e.getKeyCode() + "イベント" + e.getID());
            if (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
                jlMsg.setText("魔王が現れた！");                            //何かキーを押すとjlChildの内容が変わる
            }
            if (e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
                jpChild2.removeAll();
                addMonster();
            }
            if (e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
                jlMsg.setText("体力が全回復した！");
            }
        }
    }

    JPanel createBasicPanel() throws IOException {

        JPanel jp = MyLib.createPanel(Color.BLACK);
        //レイアウト1行目
    JPanel jpChild1 = MyLib.createPanel(Color.BLACK);                           //背景色を指定
        jpChild1.setPreferredSize(new Dimension(1000, 100));
        jp.add(jpChild1);
        JLabel jl = new JLabel(Player.getStatus());                             //JFrame上に出力するインスタンスを生成
        jl.setFont(new Font("メイリオ", 0, 50));                //Font種類大きさなどの設定
        jl.setForeground(new Color(255, 128, 0));                         //文字の色の指定 色の要素を指定するならインスタンスを生成する必要がある
        jpChild1.add(jl);                                                       //JFrame上のJPanelに出力
        
        //画像の挿入 96*96 レイアウト２行目
        jpChild2 = MyLib.createPanel(Color.CYAN);                              //背景色を指定
        jp.add(jpChild2);
        JLabel jlMain =new JLabel("<html>１．魔王を倒しに行く<br>２．修行する<br>３．宿屋に泊まる");
        jlMain.setFont(new Font("メイリオ", 0, 50));
        jpChild2.add(jlMain);

        //区切り線
        JPanel jpHR = MyLib.createPanel(Color.WHITE);
        jpHR.setPreferredSize(new Dimension(1000, 3));
        jp.add(jpHR);
        
        //レイアウト３行目
        JPanel jpChild3 = MyLib.createPanel(Color.BLACK);                              //背景色を指定
        jp.add(jpChild3);
        
        jlMsg = new JLabel("魔王が世界を滅ぼそうとしています。");
        jlMsg.setFont(new Font("メイリオ", 0, 30));
        jlMsg.setForeground(Color.WHITE);
        jpChild3.add(jlMsg);

        return(jp);                                                              //これは必須
    }

    void addMonster(){
        Random r = new Random();
        //敵が出現する
        int enemy = r.nextInt(4) + 1;
        //敵グラフィック表示
        int i = 0; //敵を出現させる
        int sw = 200; int sh = 200;
        int cw = 96; int ch = 96;                                              
        int x = 0; int y =  r.nextInt(4);
        while (i < enemy) {
            MyLib.putMonster(x, y, cw, ch, sw, sh, bi, jpChild2);
            i += 1;
        }
        
        int d = r.nextInt(4) + 1; //修行の際に受けるダメージのランダム1~4
        if (Player.hp > d) {
            if (Player.level < 100){
                Console.receiveDamage(d);
                Player.level += enemy;
                if (Player.level > 100) {
                    Player.level = 100;
                }
                jlMsg.setText(
                    "<html>敵が" + enemy + "体現れた！<br>" +
                    Player.name + "は" + d + "のダメージを受けた。<br>" +
                    Player.name + "はレベル" + Player.level + "になりました。");
                // putCommand();
            } //else if (Player.level == 100) {
            //     Part01.put("ミナトは強くなりすぎたので、魔王討伐に向かいました");
            //     Part01.put("魔王が現れた！");
            // }
        } else {
            jlMsg.setText(Player.name + "は疲れて修行できなかった。");
            // putCommand();
        }
    }
}

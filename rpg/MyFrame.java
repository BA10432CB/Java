import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;   //JFrame,JLabel,JPanel
import java.util.Random; 
public class MyFrame extends JFrame { //implements KeyListener    
    JLabel jl;     
    JLabel jlMain;                                  //JFrameクラスの継承
    JLabel jlMsg;
    JPanel jpChild2;
    BufferedImage bi;
    BufferedImage biInn;
    BufferedImage biDevil;
    Player m_player;
    public MyFrame() throws IOException { 
        m_player = new Player();                                             //コンストラクタ化　ファイル名と同じ名前で定義する
        File file1 = new File("pipo-charachip020.png");                 //ファイルを開く
        bi = ImageIO.read(file1);                                                //画像全体を読み込む
        File fileInn = new File("32x32mapchip_20190721.png");
        biInn = ImageIO.read(fileInn);
        File fileDevil = new File("devil.png");
        biDevil = ImageIO.read(fileDevil);
        setBounds(100, 80, 1000, 600);                         //初期状態のWindowの配置と大きさを指定する(x, y, width, height)
        setDefaultCloseOperation(EXIT_ON_CLOSE);                                //JFrameの×を押した際にプログラムを止める為の指示
        add(createBasicPanel());
        setVisible(true); 

        enableEvents(java.awt.AWTEvent.KEY_EVENT_MASK);                         //キー入力有効化 ここでprocessKeyEvent()を呼び出す非同期 色々なEVENT_MASKあるから悩んだら見る
        // addKeyListener(this);
    }

    protected void processKeyEvent(KeyEvent e) {                                //キー受け取り・どのキーが押されたか判定
        if (e.getID() == KeyEvent.KEY_PRESSED ){
            System.out.println("キー" + e.getKeyCode() + "イベント" + e.getID());   //何かキーを押すとjlChildの内容が変わる
            if (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
                jpChild2.removeAll();
                addDevil();
            }
            if (e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
                jpChild2.removeAll();
                addMonster();
            }
            if (e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
                jpChild2.removeAll();
                addInn();
            }
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                jpChild2.removeAll();
                jpChild2.add(jlMain);
                if (m_player == null) { // GAMEOVERのとき null空っぽ
                    jlMsg.setText("魔王が世界を滅ぼそうとしています。");
                    m_player = new Player();
                    jl.setText(m_player.getStatus());
                } else {
                    jlMsg.setText("何をしますか？");
                }
            }
        }
    }

    JPanel createBasicPanel() throws IOException {

        JPanel jp = MyLib.createPanel(Color.BLACK);
        //レイアウト1行目
        JPanel jpChild1 = MyLib.createPanel(Color.BLACK);                           //背景色を指定
        jp.add(jpChild1);
        jl = new JLabel(m_player.getStatus());                             //JFrame上に出力するインスタンスを生成
        jl.setFont(new Font("メイリオ", 0, 45));                //Font種類大きさなどの設定
        jl.setPreferredSize(new Dimension(1000, 100));
        jl.setForeground(new Color(255, 128, 0));                         //文字の色の指定 色の要素を指定するならインスタンスを生成する必要がある
        jpChild1.add(jl);                                                       //JFrame上のJPanelに出力
        
        //画像の挿入 96*96 レイアウト２行目
        jpChild2 = MyLib.createPanel(Color.CYAN);                              //背景色を指定
        jp.add(jpChild2);
        jlMain =new JLabel("<html>１．魔王を倒しに行く<br>２．修行する<br>３．宿屋に泊まる");
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

        return(jp);                                                              //これは必須戻り値JPanelを設定している
    }

    //魔王を倒しに行く
    void addDevil() {
        int x = 0; int y = 0;
        int cw = 600 - x; int ch = 600 - y;
        MyLib.putImage(x, y, cw, ch, 200, 200, biDevil, jpChild2);
        battleDevil();
    }

    void battleDevil() {
        int d = 60;
        m_player.setHp(jl, m_player.getHp() - d);
        jlMsg.setText("<html>魔王が現れた！<br>" + 
                      "魔王の攻撃！<br>" + 
                      m_player.name + "は" + d + "のダメージを受けた。<br>");
        String sFault = "<html>" + m_player.name + "は力尽きた...。<br>" + "魔王に敗北しました。<br>" + "GAME OVER...";
        String sClear = "<html>" + m_player.name + "の攻撃！<br>" + m_player.name + "は魔王を倒しました！<br>" + "GAME CLEAR!!";
        if (m_player.getHp() <= 0) {
            m_player.setHp(jl, 0);
            jl.setText(m_player.getStatus());
            jlMsg.setText(sFault);
            m_player = null;
        } else {
            jl.setText(m_player.getStatus());
            jlMsg.setText(sClear);
        }
    }

    //修行する
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
        trainingAction(r, enemy);
    }

    void trainingAction(Random r, int e) {
        int d = r.nextInt(4) + 1; //修行の際に受けるダメージのランダム1~4
        String sFixed = "<html>敵が" + e + "体現れた！<br>" +
                        m_player.name + "は" + d + "のダメージを受けた。<br>";
                        String sGameOver = "GAME OVER...";
        m_player.setHp(jl, m_player.getHp() - d);
        if (m_player.getHp() <= 0) {
            m_player.setHp(jl, 0);
            m_player = null;
        } else {
        }
        try {
            m_player.setLevel(jl, m_player.getLevel() + e);
            String sUp = m_player.name + "はレベル" + m_player.getLevel() + "になりました。";
            sFixed += sUp;
        } catch (NullPointerException npe) { // 例外のキャッチ
            sFixed += sGameOver;
        }
        jlMsg.setText(sFixed);
    }

    //宿屋に泊まる
    void addInn() {
        int x = 290; int y = 275;
        int cw = 640 - x; int ch = 480 - y;
        MyLib.putImage(x, y, cw, ch, 300, 240, biInn, jpChild2);
        stayInn();
    }

    void stayInn() {
        if (m_player.gold >= 10){
            m_player.gold -= 10;
            m_player.setHp(jl, m_player.getLevel());
            jlMsg.setText("<html>" + m_player.name + "10ゴールドを支払った。<br>体力が全回復した！");
        } else {
            jlMsg.setText("所持金が足りません。");
        }
    }
}

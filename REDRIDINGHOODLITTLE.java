package gamemee;

import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class REDRIDINGHOODLITTLE {

    private static final int Width = 1280; //1295
    private static final int Height = 747; //757

    public static void main(String[] args) {
        JFrame jf = new play();
        jf.setSize(Width, Height);
        jf.setTitle("RED RIDING HOODLITTLE");
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true); 
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);

    }

}



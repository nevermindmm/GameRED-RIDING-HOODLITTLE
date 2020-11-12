package gamemee;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Menu extends JPanel {

    private ImageIcon feild = new ImageIcon(this.getClass().getResource("background.jpg"));
    private ImageIcon starts = new ImageIcon(this.getClass().getResource("BttStart.jpg"));
    private ImageIcon about = new ImageIcon(this.getClass().getResource("BttAbout.jpg"));
    private ImageIcon howto = new ImageIcon(this.getClass().getResource("BttHowto.jpg"));
    public JButton BttStart = new JButton(starts);
    public JButton BttAbout = new JButton(about);
    public JButton BttHowto = new JButton(howto);

    public Menu() {
        setLayout(null);

        BttStart.setBounds(470, 400, 360, 80);
        BttAbout.setBounds(500, 500, 290, 60);
        BttHowto.setBounds(400, 580, 500, 55);
        add(BttStart);
        add(BttAbout);
        add(BttHowto);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(feild.getImage(), 0, 0, 1280, 720, this);

    }

}

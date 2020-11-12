
package gamemee;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class About extends JPanel
{
    private final ImageIcon AboutBG = new ImageIcon(this.getClass().getResource("About1.jpg"));
    private final ImageIcon back = new ImageIcon(this.getClass().getResource("BttBack.jpg"));
    public JButton BttBack = new JButton(back);
    
    public About(){
        setLayout(null);
        BttBack.setBounds(1050, 30, 200, 60);
        add(BttBack);
    }
   public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(AboutBG.getImage(), 0, 0, 1280, 695, this);

    }
}

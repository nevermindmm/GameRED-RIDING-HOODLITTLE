
package gamemee;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Howto extends JPanel
{
     private final ImageIcon howtoBG = new ImageIcon(this.getClass().getResource("Example1.jpg"));
     private final ImageIcon back = new ImageIcon(this.getClass().getResource("BttBack.jpg"));
     public JButton BttBack = new JButton(back);
     
     public Howto(){
         setLayout(null);
         BttBack.setBounds(50, 30, 200, 60);
         add(BttBack);
     }
     
      public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(howtoBG.getImage(), 0, 0, 1280, 695, this);

    }
     
}


package gamemee;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class play extends JFrame implements ActionListener {
    Menu menu = new Menu();
    Howto howto =new Howto();
    About about =new About();
    State1 state1 =new State1();
    
    public play(){
    this.setSize(1280, 747);
    this.add(menu);
    menu.BttStart.addActionListener(this);
    menu.BttAbout.addActionListener(this);
    menu.BttHowto.addActionListener(this);
    about.BttBack.addActionListener(this);
    howto.BttBack.addActionListener(this);
}

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == menu.BttStart){
            this.remove(menu);
            this.setSize(1280, 720);
            this.add(state1);
            state1.times = 149;
            state1.timestart = false;

        }
        else if (e.getSource() == menu.BttHowto) {
            this.remove(menu);
            this.setSize(1280, 720);
            this.add(howto);
        }
        else if (e.getSource() == howto.BttBack) {
            this.remove(howto);
            this.setSize(1280, 747);
            this.add(menu);
        }
        if (e.getSource() == menu.BttAbout) {
            this.remove(menu);
            this.setSize(1280, 720);
            this.add(about);
        }
        else if (e.getSource() == about.BttBack) {
            this.remove(about);
            this.setSize(1280, 747);
            this.add(menu);
        }           
    }
}

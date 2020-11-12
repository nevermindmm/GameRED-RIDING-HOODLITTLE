package gamemee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class State1 extends JPanel implements ActionListener {
//1
    private final ImageIcon state13 = new ImageIcon(this.getClass().getResource("state1-3.jpg"));
    private final ImageIcon state46 = new ImageIcon(this.getClass().getResource("state4-6.jpg"));
    private final ImageIcon state710 = new ImageIcon(this.getClass().getResource("state7-10.jpg"));
    private final ImageIcon monster1 = new ImageIcon(this.getClass().getResource("ไก่.png"));
    private final ImageIcon monster2 = new ImageIcon(this.getClass().getResource("กระต่าย.png"));
    private final ImageIcon monster3 = new ImageIcon(this.getClass().getResource("หมู.png"));
    private final ImageIcon monster4 = new ImageIcon(this.getClass().getResource("จิ้งโจ้.png"));
    private final ImageIcon monster5 = new ImageIcon(this.getClass().getResource("กบ.png"));
    private final ImageIcon monster6 = new ImageIcon(this.getClass().getResource("กิ้งก่า.png"));
    private final ImageIcon monster7 = new ImageIcon(this.getClass().getResource("งู.png"));
    private final ImageIcon monster8 = new ImageIcon(this.getClass().getResource("ค้างคาว.png"));
    private final ImageIcon monster9 = new ImageIcon(this.getClass().getResource("แกะ.png"));
    private final ImageIcon monster10 = new ImageIcon(this.getClass().getResource("หมาป่า.png"));
    private final ImageIcon potion = new ImageIcon(this.getClass().getResource("PotionIcon.png"));
    private final ImageIcon upgrade = new ImageIcon(this.getClass().getResource("UpgradeIcon.png"));
    private final ImageIcon OverBG = new ImageIcon(this.getClass().getResource("gameover.jpg"));
    private final ImageIcon winBG = new ImageIcon(this.getClass().getResource("wingame.jpg"));
    private final ImageIcon AtkEffect = new ImageIcon(this.getClass().getResource("AtkEffect.png"));

    public JButton BttMonster1 = new JButton(monster1);
    public JButton BttMonster2 = new JButton(monster2);
    public JButton BttMonster3 = new JButton(monster3);
    public JButton BttMonster4 = new JButton(monster4);
    public JButton BttMonster5 = new JButton(monster5);
    public JButton BttMonster6 = new JButton(monster6);
    public JButton BttMonster7 = new JButton(monster7);
    public JButton BttMonster8 = new JButton(monster8);
    public JButton BttMonster9 = new JButton(monster9);
    public JButton BttMonster10 = new JButton(monster10);
    public JButton BttPotion = new JButton(potion);
    public JButton BttUpgrade = new JButton(upgrade);

    ///////////////////////// VARIABLE ///////////////////////////
    public int times;
    boolean timestart = true;
    public int count = 0;
    int lvl;
    int pg = 10; //price upgrade
    int mk = 10; //atk monster
    int x = 500;  //monster X
    int y; //monster Y
    boolean h = true;
    boolean m1 = true;
    boolean m2;
    boolean m3;
    boolean m4;
    boolean m5;
    boolean m6;
    boolean m7;
    boolean m8;
    boolean m9;
    boolean m10;
    ////////////////////////////////////////////////////////////
    Monster1 M1 = new Monster1();
    Monster2 M2 = new Monster2();
    Monster3 M3 = new Monster3();
    Monster4 M4 = new Monster4();
    Monster5 M5 = new Monster5();
    Monster6 M6 = new Monster6();
    Monster7 M7 = new Monster7();
    Monster8 M8 = new Monster8();
    Monster9 M9 = new Monster9();
    Monster10 M10 = new Monster10();
    ///////////////NAME AND HP//////////////////////////////////
    String[] name = {"CHICHEN", "RABBIT", "FATBIG", "KANGAROO", "FROG", "CHAMELEON", "SNAKE", "BAT", "SHEEP", "WOLF"};
    int[] hp = {15,20, 20, 25, 25, 30, 30, 35,35,40};
//2
    ///////////////////////////////////////////////////////////
    public State1() {
        setLayout(null);
        BttMonster1.setOpaque(false);
        BttMonster1.setContentAreaFilled(false);
        BttMonster1.setBorderPainted(false);
        BttMonster1.addActionListener(this);
        add(BttMonster1);
        //--------------------------MONSTER1
        BttMonster2.setOpaque(false);
        BttMonster2.setContentAreaFilled(false);
        BttMonster2.setBorderPainted(false);
        BttMonster2.addActionListener(this);
        //--------------------------MONSTER2;
        BttMonster3.setOpaque(false);
        BttMonster3.setContentAreaFilled(false);
        BttMonster3.setBorderPainted(false);
        BttMonster3.addActionListener(this);
        //--------------------------MONSTER3
        BttMonster4.setOpaque(false);
        BttMonster4.setContentAreaFilled(false);
        BttMonster4.setBorderPainted(false);
        BttMonster4.addActionListener(this);
        //--------------------------MONSTER4
        BttMonster5.setOpaque(false);
        BttMonster5.setContentAreaFilled(false);
        BttMonster5.setBorderPainted(false);
        BttMonster5.addActionListener(this);
        //--------------------------MONSTER5
        BttMonster6.setOpaque(false);
        BttMonster6.setContentAreaFilled(false);
        BttMonster6.setBorderPainted(false);
        BttMonster6.addActionListener(this);
        //--------------------------MONSTER6
        BttMonster7.setOpaque(false);
        BttMonster7.setContentAreaFilled(false);
        BttMonster7.setBorderPainted(false);
        BttMonster7.addActionListener(this);
        //--------------------------MONSTER7
        BttMonster8.setOpaque(false);
        BttMonster8.setContentAreaFilled(false);
        BttMonster8.setBorderPainted(false);
        BttMonster8.addActionListener(this);
        //--------------------------MONSTER8
        BttMonster9.setOpaque(false);
        BttMonster9.setContentAreaFilled(false);
        BttMonster9.setBorderPainted(false);
        BttMonster9.addActionListener(this);
        //--------------------------MONSTER9
        BttMonster10.setOpaque(false);
        BttMonster10.setContentAreaFilled(false);
        BttMonster10.setBorderPainted(false);
        BttMonster10.addActionListener(this);
        //--------------------------MONSTER10

        //----------------------------------------
        BttPotion.setBounds(20, 100, 150, 150);
        BttPotion.setOpaque(false);
        BttPotion.setContentAreaFilled(false);
        BttPotion.setBorderPainted(false);
        BttPotion.addActionListener(this);
        add(BttPotion);
        //--------------------------POTION
        BttUpgrade.setBounds(20, 210, 150, 150);
        BttUpgrade.setOpaque(false);
        BttUpgrade.setContentAreaFilled(false);
        BttUpgrade.setBorderPainted(false);
        BttUpgrade.addActionListener(this);
        add(BttUpgrade);
        //--------------------------UPGRADE
        time.start();
        move.start();
        attack.start();
    }
    //////////////////////////// THREAD //////////////////////
    Thread time = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }

                if (timestart == false) {
                    repaint();
                }
            }
        }
    });
    //3
    Thread move = new Thread(new Runnable() {
        public void run() {
            while (true) {
                if (timestart == false) {
                    if (times % 7 != 0) {
                        if (m1) {
                            BttMonster1.setBounds(M1.x, M1.y, 200, 196);
                            M1.move();
                            add(BttMonster1);
                            hp[1]=20;
                        } else if (m2) {
                            remove(BttMonster1);
                            BttMonster2.setBounds(M2.x, M2.y, 300, 205);
                            M2.move();
                            hp[2]=20;
                            add(BttMonster2);
                        } else if (m3) {
                            remove(BttMonster2);
                            BttMonster3.setBounds(M3.x, M3.y, 300, 280);
                            M3.move();
                            hp[3]=25;
                            add(BttMonster3);
                        } else if (m4) {
                            remove(BttMonster3);
                            BttMonster4.setBounds(M4.x, M4.y, 198, 220);
                            M4.move();
                            hp[4]=25;
                            add(BttMonster4);
                        } else if (m5) {
                           remove(BttMonster4);
                            BttMonster5.setBounds(M5.x, M5.y, 267, 220);
                            M5.move();
                            hp[5]=30;
                            add(BttMonster5);
                        } else if (m6) {
                            remove(BttMonster5);
                            BttMonster6.setBounds(M6.x, M6.y, 274, 350);
                            M6.move();
                            hp[6]=30;
                            add(BttMonster6);
                        } else if (m7) {
                            remove(BttMonster6);
                            BttMonster7.setBounds(M7.x, M7.y, 277, 290);
                            M7.move();
                            hp[7]=35;
                            add(BttMonster7);
                        } else if (m8) {
                            remove(BttMonster7);
                            BttMonster8.setBounds(M8.x, M8.y, 319, 290);
                            M8.move();
                            hp[8]=35;
                            add(BttMonster8);
                        } else if (m9) {
                            remove(BttMonster8);
                            BttMonster9.setBounds(M9.x, M9.y, 400, 331);
                            M9.move();
                            hp[9]=40;
                            add(BttMonster9);
                        } else if (m10) {
                            remove(BttMonster9);
                            BttMonster10.setBounds(M10.x, M10.y, 339, 330);
                            M10.move();
                            add(BttMonster10);
                        }
                    }
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });
    //4มอนสเตอร์ตีทุกๆ7s
    Thread attack = new Thread(new Runnable() {
        public void run() {
            while (true) {
                if (timestart == false) {
                    times = (times - 1);
                    if (times % 7 == 0) { ///MONSTER ATTACK //
                        Player.HP = (Player.HP - mk);
                        System.out.println("Damaged: " + mk);
                        if (m1) {
                            //  remove(BttMonster1);
                            BttMonster1.setBounds(M1.x, M1.y + 50, 200, 196);
                            add(BttMonster1);
                            
                        } else if (m2) {
                            // remove(BttMonster2);
                            BttMonster2.setBounds(M2.x, M2.y + 50, 300, 205);
                            add(BttMonster2);
                        } else if (m3) {
                            // remove(BttMonster3);
                            BttMonster3.setBounds(M3.x, M3.y + 50, 300, 280);
                            add(BttMonster3);
                        } else if (m4) {
                            // remove(BttMonster4);
                            BttMonster4.setBounds(M4.x, M4.y + 50, 198, 220);
                            add(BttMonster4);
                        } else if (m5) {
                            // remove(BttMonster5);
                            BttMonster5.setBounds(M5.x, M5.y + 50, 267, 220);
                            add(BttMonster5);
                        } else if (m6) {
                            // remove(BttMonster6);
                            BttMonster6.setBounds(M6.x, M6.y + 50, 274, 350);
                            add(BttMonster6);
                        } else if (m7) {
                            // remove(BttMonster7);
                            BttMonster7.setBounds(M7.x, M7.y + 50, 277, 290);
                            add(BttMonster7);
                        } else if (m8) {
                            // remove(BttMonster8);
                            BttMonster8.setBounds(M8.x, M8.y + 50, 319, 290);
                            add(BttMonster8);
                        } else if (m9) {
                            // remove(BttMonster9);
                            BttMonster9.setBounds(M9.x, M9.y + 50, 400, 331);
                            add(BttMonster9);
                        } else if (m10) {
                            //7 remove(BttMonster10);
                            BttMonster10.setBounds(M10.x, M10.y + 40, 339, 330);
                            add(BttMonster10);
                        }

                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });
    //////////////////////////////////////////////////////////////
//5;วาดจอ
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(state13.getImage(), 0, 0, 1280, 695, this);
        g.setFont(new Font("2005_iannnnnTKO", Font.CENTER_BASELINE, 50));
        g.setColor(Color.ORANGE);
        g.drawString("HP: " + hp[count], 530, 150);
        //------Monster1HP
        g.setColor(Color.BLACK);
        g.drawString("HP: " + Player.HP, 500, 650);
        //-------PlayerHP
        g.setColor(Color.YELLOW);
        g.drawString("GOLD: " + Player.GOLD, 50, 650);
        g.drawString("10 G", 150, 200);
        g.drawString(pg + " G", 150, 300);
        //-------GOLD
        g.setColor(Color.RED);
        g.drawString("ATK: " + Player.ATK, 1000, 650);
        g.drawString("Time: " + times, 1000, 100);
        //-------ATK     
        g.setFont(new Font("2005_iannnnnTKO", Font.BOLD, 50));
        g.setColor(Color.BLACK);
        g.drawString(name[count], 530, 100);
        //-------MonsterName 

        if (times % 7 == 0) {
            g.setColor(Color.RED);
            g.drawString("-" + mk, 700, 630);
        }
        if (Player.HP <= 0 || times == 0) {
            g.drawImage(OverBG.getImage(), 0, 0, 1280, 720, this);
            this.setLayout(null);
            remove(BttMonster1);
            remove(BttMonster2);
            remove(BttMonster3);
            remove(BttPotion);
            remove(BttUpgrade);
            System.out.println("****YOU DIED****");
            time.stop();
            move.stop();
            attack.stop();
        }
        //------------------7
        if (hp[0] <= 0) {
           //remove(BttMonster1);
            mk = mk + 2; //atk monster
            m1 = false;
            m2 = true;
            count = 1;
            Player.GOLD = Player.GOLD + 5;
            // repaint();
            hp[0] = hp[0] + 10000;

        }

        if (hp[1] <= 0) {
            //remove(BttMonster2);
            mk = mk + 2; //atk monster
            m2 = false;
            m3 = true;
            count = 2;
            Player.GOLD = Player.GOLD + 10;
            // repaint();
            hp[1] = hp[1] + 10000;

        }
        if (hp[2] <= 0) {
            //remove(BttMonster3);
            mk = mk + 2; //atk monster
            m3 = false;
            m4 = true;
            count = 3;
            Player.GOLD = Player.GOLD + 10;
            //this.repaint();
            hp[2] = hp[2] + 10000;
            lvl = 2;
        }
        if (lvl == 2) { //--------------------------------STATE 2
            g.drawImage(state46.getImage(), 0, 0, 1280, 695, this);
            g.setFont(new Font("2005_iannnnnTKO", Font.CENTER_BASELINE, 50));
            g.setColor(Color.ORANGE);
            g.drawString("HP: " + hp[count], 530, 150);
            //------Monster1HP
            g.setColor(Color.BLACK);
            g.drawString("HP: " + Player.HP, 500, 650);
            //-------PlayerHP
            g.setColor(Color.YELLOW);
            g.drawString("GOLD: " + Player.GOLD, 50, 650);
            g.drawString("10 G", 150, 200);
            g.drawString(pg + " G", 150, 300);
            //-------GOLD
            g.setColor(Color.RED);
            g.drawString("ATK: " + Player.ATK, 1000, 650);
            g.drawString("Time: " + times, 1000, 100);
            //-------ATK     
            g.setFont(new Font("2005_iannnnnTKO", Font.BOLD, 50));
            g.setColor(Color.BLACK);
            g.drawString(name[count], 530, 100);
            //-------MonsterName 
            if (times % 7 == 0) {
                g.setColor(Color.RED);
                g.drawString("-" + mk, 700, 630);
            }
            if (Player.HP <= 0 || times == 0) {
                g.drawImage(OverBG.getImage(), 0, 0, 1280, 720, this);
                this.setLayout(null);
                remove(BttMonster4);
                remove(BttMonster5);
                remove(BttMonster6);
                remove(BttPotion);
                remove(BttUpgrade);
                time.stop();
                move.stop();
                attack.stop();

            }
        }//-----------------------------------------------------
        if (hp[3] <= 0) {
            //remove(BttMonster4);
            mk = mk + 2; //atk monster
            m4 = false;
            m5 = true;
            count = 4;
            Player.GOLD = Player.GOLD + 15;
            //repaint();
            hp[3] = hp[3] + 10000;

        }
        if (hp[4] <= 0) {
            //remove(BttMonster5);
            mk = mk + 2; //atk monster
            m5 = false;
            m6 = true;
            count = 5;
            Player.GOLD = Player.GOLD + 15;
            // repaint();
            hp[4] = hp[4] + 10000;

        }
        if (hp[5] <= 0) {
            //remove(BttMonster6);
            mk = mk + 2; //atk monster
            m6 = false;
            m7 = true;
            count = 6;
            Player.GOLD = Player.GOLD + 15;
            //  repaint();
            hp[5] = hp[5] + 10000;
            lvl = 3;

        }
        if (lvl == 3) {//--------------------------------STATE 3
            g.drawImage(state710.getImage(), 0, 0, 1280, 695, this);
            g.setFont(new Font("2005_iannnnnTKO", Font.CENTER_BASELINE, 50));
            g.setColor(Color.ORANGE);
            g.drawString("HP: " + hp[count], 530, 150);
            //------Monster1HP
            g.setColor(Color.BLACK);
            g.drawString("HP: " + Player.HP, 500, 650);
            //-------PlayerHP
            g.setColor(Color.YELLOW);
            g.drawString("GOLD: " + Player.GOLD, 50, 650);
            g.drawString("10 G", 150, 200);
            g.drawString(pg + " G", 150, 300);
            //-------GOLD
            g.setColor(Color.RED);
            g.drawString("ATK: " + Player.ATK, 1000, 650);
            g.drawString("Time: " + times, 1000, 100);
            //-------ATK     
            g.setFont(new Font("2005_iannnnnTKO", Font.BOLD, 50));
            g.setColor(Color.BLACK);
            g.drawString(name[count], 530, 100);
            //-------MonsterName
            if (times % 7 == 0) {
                g.setColor(Color.RED);
                g.drawString("-" + mk, 700, 650);
            }
            if (Player.HP <= 0 || times == 0) {
                g.drawImage(OverBG.getImage(), 0, 0, 1280, 720, this);
                this.setLayout(null);
                remove(BttMonster7);
                remove(BttMonster8);
                remove(BttMonster9);
                remove(BttMonster10);
                remove(BttPotion);
                remove(BttUpgrade);
                time.stop();
                move.stop();
                attack.stop();

            }
        }//-----------------------------------------------------
        if (hp[6] <= 0) {
            //remove(BttMonster7);
            mk = mk + 2; //atk monster
            m7 = false;
            m8 = true;
            count = 7;
            Player.GOLD = Player.GOLD + 25;
            //  repaint();
            hp[6] = hp[6] + 10000;

        }
        if (hp[7] <= 0) {
            //remove(BttMonster8);
            mk = mk + 2; //atk monster
            m8 = false;
            m9 = true;
            count = 8;
            Player.GOLD = Player.GOLD + 25;
            //  repaint();
            hp[7] = hp[7] + 10000;

        }
        if (hp[8] <= 0) {
            //remove(BttMonster9);
            mk = mk + 2; //atk monster
            m9 = false;
            m10 = true;
            count = 9;
            Player.GOLD = Player.GOLD + 25;
            //   repaint();
            hp[8] = hp[8] + 10000;

        }
        if (hp[9] <= 0) {
            m10 = false;
            System.out.println("Littlegirl was killed");
            System.out.println("You win");
            this.setLayout(null);
            g.drawImage(winBG.getImage(), 0, 0, 1280, 695, this);
        
            remove(BttPotion);
            remove(BttUpgrade);
            remove(BttMonster10);
            time.stop();
            move.stop();
            attack.stop();
        }

    }
//8 event 
        public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BttMonster1) {
            hp[count] = hp[count] - (Player.ATK);
            System.out.println("Dmg: " + Player.ATK);
        } else if (e.getSource() == BttMonster2) {
            hp[count] = hp[count] - (Player.ATK);
            System.out.println("Dmg: " + Player.ATK);
        } else if (e.getSource() == BttMonster3) {
            hp[count] = hp[count] - (Player.ATK);
            System.out.println("Dmg: " + Player.ATK);
        } else if (e.getSource() == BttMonster4) {
            hp[count] = hp[count] - (Player.ATK);
            System.out.println("Dmg: " + Player.ATK);
        } else if (e.getSource() == BttMonster5) {
            hp[count] = hp[count] - (Player.ATK);
            System.out.println("Dmg: " + Player.ATK);
        } else if (e.getSource() == BttMonster6) {
            hp[count] = hp[count] - (Player.ATK);
            System.out.println("Dmg: " + Player.ATK);
        } else if (e.getSource() == BttMonster7) {
            hp[count] = hp[count] - (Player.ATK);
            System.out.println("Dmg: " + Player.ATK);
        } else if (e.getSource() == BttMonster8) {
            hp[count] = hp[count] - (Player.ATK);
            System.out.println("Dmg: " + Player.ATK);
        } else if (e.getSource() == BttMonster9) {
            hp[count] = hp[count] - (Player.ATK);
            System.out.println("Dmg: " + Player.ATK);
        } else if (e.getSource() == BttMonster10) {
            hp[count] = hp[count] - (Player.ATK);
            System.out.println("Dmg: " + Player.ATK);
        } else if (e.getSource() == BttPotion) {
            if (Player.GOLD >= 10) {
                Player.HP = Player.HP + 5;
                Player.GOLD = Player.GOLD - 10;
                System.out.println("HP +10!!");
            }
        } else if (e.getSource() == BttUpgrade) {
            if (Player.GOLD >= pg) {
                Player.ATK = Player.ATK + 3;
                Player.GOLD = Player.GOLD - 10;
                pg = pg * 2;
            }
        }
        this.validate();
        this.repaint();
    }

}

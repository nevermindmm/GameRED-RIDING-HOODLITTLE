
package gamemee;

public class Monster10 
{
    public int x = 500; //450
    public int y = 20; //230
    public boolean n =true;
    public boolean nn;
    public boolean nnn =true;
    
    public void move() {
        if (x >= 800) {
            n = true;
        }
        if (x <= 200) {
            n = false;
        }
        if (n == false) {
            x += 5;
        }
        if (n == true) {
            x -= 5;
        }
        if (y == 20) {
            nn = false;
        }
        if (y == 230) {
            nn = true;
        }
        if (nn == false) {
            y += 5;
        }
        if (nn == true) {
            y -= 5;
        }
    }
}

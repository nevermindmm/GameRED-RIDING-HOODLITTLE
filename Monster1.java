
package gamemee;
public class Monster1 
{
    public int x = 500;
    public int y = 350;
    public boolean n,nn;
    
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
        if (y == 300) {
            nn = false;
        }
        if (y == 350) {
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

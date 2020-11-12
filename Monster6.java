
package gamemee;

public class Monster6
{
    public int x = 0; //500
    public int y = 200; //300
    boolean n,nn;
    
    public void move() {
        x+=10;
        if(x==750)
        {
            n=true;
        }
        if(n)
        {
            x-=20;
            if(x==200)
            {
                n=false;
            }
        }
    }
}




package gamemee;
public class Monster5 
{
    public int x = 1280; //500
    public int y = 300; //300
    boolean n,nn;
    
    public void move() {
        x-=10;
        if(x==200)
        {
            n=true;
        }
        if(n)
        {
            x+=20;
            if(x==750)
            {
                n=false;
            }
        }
    }
}

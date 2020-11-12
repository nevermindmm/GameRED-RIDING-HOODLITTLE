
package gamemee;
public class Monster3 
{
    public int x = 500; //500
    public int y = 0; //300
    boolean n,nn;
    
    public void move() {
      x +=10;
      if(y== 250){
        if(x==750 && n)
        {
            n=false;
        }
        else if(!n)
        {
            x -=20;
            if(x==200)
            {
                n=true;
            }
        }
      }
      else
      {
        y +=10; 
        if(x==600 && n)
        {
            n=false;
        }
        else if(!n)
        {
          x -=20;
          if(x==300)
          {
            n=true;
          }
        }
      }
    }
}


package gamemee;
public class Monster9 
{
    public int x = 450; //450
    public int y = 0; //300
    public boolean n =true;
    
    public void move() {
      x +=10;
      if(y== 230){
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

import java.util.Random;
import java.util.Scanner;
class game{
   int g;
    Random r=new Random();
    private int x=r.nextInt(101);
    public int display()
    {
        return x;
    }

    public void guess()
    {
        Scanner sc=new Scanner(System.in);
        int g=sc.nextInt();
       // System.out.println(g);
        if(g>x)
            System.out.println("guessd number is bigger than orginal no.");
        else if(g<x)
            System.out.println("guessd number is smaller than orginal no.");
    }

   /* public void output()
    {

        if(g>x)
            System.out.println("guessd number is bigger than orginal no.");
        else if(g<x)
            System.out.println("guessd number is smaller than orginal no.");
       // else if(g==x)
        //    System.out.println("you  guessed it righttt!");
    }*/
    public void correct()
    {
        if(g==x)
            System.out.println("YOU GUESSED IT RIGHTTTT!");
    }
    public void output()
    {    int i=0;
        while(g!=x)
        {
            guess();
            i++;
            if(g==x)
                break;
        }System.out.println(i);
      //  if(g==x)
      //      System.out.println("you  guessed it righttt!");
    }
}
public class Exersice3 {
    public static void main(String[] args)
    {
        game player=new game();
        System.out.println(player.display());//--displays random num.
        player.correct();
       // player.correct();
    }
}


class Game
{
    public int num;
    public int noofguess;
    public int inputno;
    public int getNoofguess()
    {
        return noofguess;
    }
    public void setNoofguess()
    {
        this.noofguess=noofguess;
    }
    void Game(int n)
    {
        this.num=n;
    }
    void Game()
    {
        Random rand=new Random();
        this.num=rand.nextInt(100);
    }
   void takeinput()
    {
        System.out.println("guess the number");
        Scanner sc=new Scanner(System.in);
        inputno=sc.nextInt();

    }
    boolean iscorrect() {
        if (inputno == num) {
            return true;
        } else if (inputno < num) {
            System.out.println("too low");
        } else if (inputno> num) {
            System.out.println("too high");
        }
            return false;
    }
    public class Exercise3{
        public static void main(String[] args) {
            Game g=new Game();
            g.takeinput();
            boolean b=g.iscorrect();
            System.out.println(b);

        }
    }
}
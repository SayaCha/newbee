import java.util.Scanner;
import java.util.Random;
public class PractiseConditionals
{
  /*  public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice :");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("wrong i/p");
        }


    }*/
    /*
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("input  string :");
      String str=sc.next();
      if(str.endsWith(".com"))
          System.out.println("its a commercial website.");
      else if(str.endsWith(".in"))
          System.out.println("its indian website");
      else if(str.endsWith(".org"))
          System.out.println("its organization website");
      else
          System.out.println("wrong input");
  }*/
    //rock paper scissor
  public static void main(String[] args) {
      Random rnum=new Random();
      System.out.println("0 - rock");
      System.out.println("1 - paper");
      System.out.println("2 - scissors");
      int x=rnum.nextInt(3);
      System.out.println("computers choice: "+x);
      Scanner sc=new Scanner(System.in);
      System.out.print("eneter your choice (0-2): ");
      int ip=sc.nextInt(3);
      if(x==ip)
          System.out.println("its a tie!!");
      else if(x==0 && ip==1)
          System.out.println("you win!! paper covers rock");
      else if(x==0 && ip==2)
          System.out.println("computer win!! rock bit scissor");
      else if(x==1 && ip==0)
          System.out.println("computer win!! paper covers rock");
      else if(x==1 && ip==2)
          System.out.println("you win!! scissors  cut paper");
      else if(x==2 && ip==1)
          System.out.println("Computer win!! scissors cut paper");
      else if(x==2 && ip==0)
          System.out.println("you win! rock bit scissors");
  }
}

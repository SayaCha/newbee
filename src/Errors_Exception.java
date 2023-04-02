
import java.util.Scanner;
class primenumber
{
    Scanner sc=new Scanner(System.in);
    // n= sc.nextInt();
    //int b=n;
    public void result(int n)
    {
        int sum=0; //3 b=3, 3!=0 3/3 ==0 sum=1, b=2 2!=0
        int b=n;
        while(b!=0)
        {
            if(n%b==0)
            {sum++;}
            b--;
        }
        if(sum==2)
        {
            System.out.println(n +" is prime number");
        }
        else
        {
            System.out.println(n +" is not prime number");
        }

    }

}
public class Errors_Exception
{
    public static void main(String[] args) {
        primenumber pn=new primenumber();
        pn.result(7);
    }
}
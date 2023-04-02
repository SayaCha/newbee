import java.util.Scanner;
public class PraciseCls
{//problem 1
    static void multiple(int n)
    {
        for(int i=1;i<=10;i++)
        {
            int m;
            m=n*i;
            System.out.println(m);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("enter a number ");
        multiple(9);
    }
    //problem 2
    /*static void triangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
       triangle(4);
   }*/
  /*  static int sum(int n)
    {
        if(n==1)
            return 1;

        return n+sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(3));  }*/
    //problem 4
   /*static float avg(int ...arr)
   {
       float result=0,i=0;
       float avgg;
       for(int a:arr)
       {
           result= result + a;
           i++;
       }
       avgg=result/i;
   return avgg;
   }

    public static void main(String[] args) {
        System.out.println("avg is "+avg(1,2,5,6,7,6,4,3,2,1,8,9,0,2,4,6));
    }*/

}


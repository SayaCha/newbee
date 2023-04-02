import java.util.Scanner;
public class Chapter2p2
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter v:");
        int v=sc.nextInt();
        System.out.println("enter u:");
        int u=sc.nextInt();
        System.out.println("enter a:");
        int a =sc.nextInt();
        System.out.println("enter s:");
        int s=sc.nextInt();
        float div=(float)(v*v-u*u)/(a*s*2);
        System.out.println(div);
    }
}


import java.util.Scanner;
public class newbee_userinput {
    public static void main(String[] args) {
        System.out.println("taking inout fromm user");
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter num.1:");
        int a=sc.nextInt();
        System.out.println("eneter num 2:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
}

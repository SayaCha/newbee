import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        System.out.println("enter marks of five subjects:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of subject 1:");
        float a=sc.nextFloat();
        System.out.println("Enter marks of subject 2:");
        float b=sc.nextFloat();
        System.out.println("Enter marks of subject 3:");
        float c=sc.nextFloat();
        System.out.println("Enter marks of subject 4:");
        float d=sc.nextFloat();
        System.out.println("Enter marks of subject 5:");
        float e=sc.nextFloat();
        float total=a+b+c+d+e;
        System.out.print("total is:");
        System.out.println(total);
        float percentage=(total/500)*100;
        System.out.println("percentage is:");
        System.out.println(percentage);
    }
}

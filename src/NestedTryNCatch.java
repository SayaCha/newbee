import java.util.Scanner;

public class NestedTryNCatch
{
    public static void main(String[] args)
    {
        int [] marks=new int [3];
        marks[0]=4;
        marks[1]=8;
        marks[2]=87;
        Scanner sc=new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter index number: ");
            int ind = sc.nextInt();
            try {
                System.out.println("welcome");
                try {
                    System.out.println(marks[ind]);
                    flag=false;//exception jb aya tb flag false hua hi nhi isliye wo loop chlta raha
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("sorry this index does not exist");
                    System.out.println("exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("exception in level 1");
            }
        }
        System.out.println("thnk you!");
    }
}

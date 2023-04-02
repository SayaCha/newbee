import java.util.Scanner;

public class SpecificExceptions {
    public static void main(String[] args) {
        int [] marks=new int [3];
        marks[0]=4;
        marks[1]=8;
        marks[2]=87;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array index: ");
       int index= sc.nextInt();
        System.out.println("Enter the number you want to devide with: ");
        int number=sc.nextInt();
        try{
            System.out.println("The value at array index entered is: "+marks[index]);
            System.out.println("the value of array-value/number is: "+marks[index]/number);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds exception occured");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception occured");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some other exception occured");
            System.out.println(e);
        }
    }
}

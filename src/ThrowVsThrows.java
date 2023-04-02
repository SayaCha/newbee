import java.util.Scanner;
import java.io.*;
class NegativeRadiusException extends Exception{
    public String toString(){return "radius cannot be negative!";}
    public String getMessage(){return "radius cannot be negative!";}
}
public class ThrowVsThrows {
    public static float area(int y) throws NegativeRadiusException{
       // Scanner sc=new Scanner(System.in);
       //  y=sc.nextInt();
        if(y<0){throw  new NegativeRadiusException();}
        float resul=y*y;
        return resul;
    }
    public static int div(int a,int b) throws ArithmeticException
    {
        int result=a/b;
        return result;
    }
    public static void  main(String[] args) {
        try{int c=div(4,0);System.out.println(c);}
        catch(Exception e){
            System.out.println("exception");
        }
        try {
            float ar=area(-8);
            System.out.println(ar);
        } catch (NegativeRadiusException e) {
            throw new RuntimeException(e);
        }
    }
}

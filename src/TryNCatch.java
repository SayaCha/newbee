/*
public class TryNCatch
{
    public static void main(String[] args) {
        int a=9;
        int b=0;
        try
       {
           int c=a/b;
           System.out.println("the result is "+ c);
       }
       //when b=0 it throws arithmetic exception
        catch(Exception e)
        {
            //System.out.println("we failed to divide");
            System.out.println(e.getMessage());
            System.out.println(e);
        }
        System.out.println("eop");
    }
} */
public class TryNCatch{
    public static void main(String[] args) {
        int balance=8000;
        int withdraw=90000;
        try
        {
        if(balance<withdraw)
            throw new ArithmeticException("insufficient balance");
        balance=balance-withdraw;
        System.out.println("transaction success");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("continue!");
    }
}

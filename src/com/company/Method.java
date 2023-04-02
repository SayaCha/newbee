package com.company;
import java.util.Scanner;
public class Method
{
        int logic(int x,int y) // object bnake fun ko call kiya isliye static word use nhi kiya.
       {
        int z;
        if (x > y)
            z = x + y;
        else
            z = (x + y) * 5;
        return z;
       }
       public static void main(String[] args)
    {
    int a=25;
    int b=37;
    int c;
   // c=logic(a,b);
    int a1=3;
    int b1=8;
    //int c1=logic(a1,b1);
   // Method obj=new Method();
        Method object=new Method(); //object creation
    c=object.logic(a,b);
        System.out.println(c);
    }
}

/*
public class Method
{
    static int c;
    static int function(int x,int y,int z) //bina object call kiya function/method ko(main function mein) isliye static use kiya.
    {
        if(x+y>z)
            c=z;
        else
            c=x;
       return c;
    }
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int ans=function(a,b,c);
        System.out.println(ans);
    }
}*/



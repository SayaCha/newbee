package com.company;
public class MethodOverloading
/*{
    static void function1(int[] arr)
    {
        arr[2]=98;
    }

    public static void main(String[] args)
    {
        int [] marks={23,56,78,89};
        function1(marks);
        System.out.println(marks[0]);
    }
}*/
{
   /* int sum(int a, int b)
    {
        return a + b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading(); // method overloading
        int e,d;
        d=obj.sum(4,3);
        e=obj.sum(3,6,7);//method overloading
        System.out.println(d);
        System.out.println(e);
    }*/
     void output()
    {
        System.out.println("hey there!");
    }
     void output(String str)
    {
        System.out.println("hey there "+str);
    }

    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.output();
        obj.output("sas");
    }
}
class Example2 {

    int x;//instance variable
    static int y;//static member variable, puri class ka variable hai

    public void fun1() {
        //static int a;--error
    }

    static class Test {
        public static String country = "INDIA";
    }

    public static void fun2() {
        y = 6;
        //x=9;--error
    }

}
public class Example1{
    public static void main(String[] args)
    {
        Example2 d=new Example2();
        Example2.y=8;// accessing static variable
        //Example2.Test;

    }
}

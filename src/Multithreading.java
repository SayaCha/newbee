class mythread extends Thread{
    public void run()
    {
    while(true){
        System.out.println("my thread is running");
        System.out.println("i am happy");
    }
    }
}
class mythread2 extends Thread{
    public void run()
    {
        while(true)
        {
            System.out.println("my thread2 is runningggggg");
            System.out.println("i am simple");
        }
    }
}
/*class Thread
{
    public void start()
    {
        System.out.println("yee");
    }
}*/
public class Multithreading
{
    public static void main(String[] args)
    {
        mythread t1=new mythread();
        mythread2 t2=new mythread2();
        Thread m1=new Thread();
        t1.run();
        t2.run();
        //t1.start();
        //t2.start();
    }
}

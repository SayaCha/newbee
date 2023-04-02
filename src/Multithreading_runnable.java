class MyrunnableThread1 implements Runnable{
    public void run()
    {
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
        System.out.println("i am a thread1!");
    }


}
class MyrunnableThread2 implements Runnable{
    public void run()
    {
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
        System.out.println("i am a thread2!");
    }
}
public class Multithreading_runnable
{
    public static void main(String[] args)
    {
       // MyrunnableThread1 te=new MyrunnableThread1();
       // te.run();
         MyrunnableThread1 bullet1=new MyrunnableThread1();
         MyrunnableThread2 bullet2=new MyrunnableThread2();
         Thread gun1=new Thread(bullet1);//--bullet1 is runnable
         Thread gun2=new Thread(bullet2);
         gun1.start();
         gun2.start();//thread me start method hai..//thread ko start krna//run mthod bnana jrur hai
    }
}
//run ko override krna jruri hota hai
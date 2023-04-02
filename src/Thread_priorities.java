class myclss extends Thread{
    public myclss(String name){
        super(name);
    }
    public void run()
    {
        int i=34;
        while(true)
        {
            System.out.println("thnks " + this.getName());
        }
    }
}
public class Thread_priorities
{
    public static void main(String[] args)
    {
        //ready queue -- T1 T2 T3 T4 T5
        myclss t1=new myclss("thread1");
        myclss t2=new myclss("thread2");
        myclss t3=new myclss("thread3");
        myclss t4=new myclss("thread4(most important)");
        t4.setPriority(Thread.MAX_PRIORITY);//-SETTING MAXIMUM PRIORITY
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t3.start();
    }
}

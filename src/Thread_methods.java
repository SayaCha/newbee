class myclss1 extends Thread
{
    public void run()
    {
        int i=0;
        while (true)
        {
            System.out.println("thnks");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class myclss2 extends Thread{
    public void run()
    {
        while(true)
        {
            System.out.println("thnk you lord " );
        }
    }
}
public class Thread_methods {
    public static void main(String[] args) {
        myclss1 t1=new myclss1();
        myclss2 t2=new myclss2();
        t1.start();
        /*try{
           t1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);//jbtk t1 khtm na hojaye tbtk t2 start mt kro
        }*/
        t2.start();
        //go on internet and search for java threads - methods ,
    }
}

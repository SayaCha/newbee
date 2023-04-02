/*
//METHOD 1
class Ay implements Runnable{
    public void run()
    {
        int i;
        for(i=0;i<=10;i++)
        {
            System.out.println("thread Ay"+i);
        }
    }
}
class By implements Runnable{
    public void run()
    {
        int i;
        for(i=0;i<=10;i++)
        {
            System.out.println("thread By"+i);
        }
    }
}
public class ThreadS
{
    public static void main(String[] args) {

        Thread t1=new Thread(new Ay());
        Thread t2=new Thread(new By());
        t1.start();
        t2.start();
    }
}
*/
class Ec extends Thread{
    public void run(){
        int i;
        for(i=1;i<=10;i++)
            System.out.println("i= "+i+"Thread A");
    }
}
class Bo extends Thread{
    public void run(){
        int i;
        for(i=1;i<=10;i++)
            System.out.println("i= "+i+"Thread B");
    }

}
public class ThreadS{
    public static void main(String[] args) {
        Ec o1=new Ec();
        Bo o2=new Bo();
        o1.start();
        o2.start();
    }
}
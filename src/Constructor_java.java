class mycls extends Thread{
    public mycls(String name){
        super(name);
    }
    public void run()
    {
        int i=1;
        System.out.println("thnks");
        //while(true)
        //{
          //  System.out.println("i am a threat!");
        //}
    }
}
public class Constructor_java {
    public static void main(String[] args)
    {
        mycls t=new mycls("sayali");
        mycls t2=new mycls("sas");
        t.start();
        t2.start();
        System.out.println("the id of the thraed is "+ t.getId());
        System.out.println("name is " + t.getName());
        System.out.println("the id of the thraed is "+ t2.getId());
        System.out.println("name is " + t2.getName());
    }
}

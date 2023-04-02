class phone
{
    public void name()
    {
        System.out.println("my name is sas!");
    }
    public void greet()
    {
        System.out.println("morning!");
    }
}
class smartphone extends phone
{
   @Override
    public void name()
    {
        System.out.println("my name is java");
    }
    public void wish()
    {
        System.out.println("congrats!");
    }//not overriden
}
public class Dynamic_m_dispatch {
    public static void main(String[] args) {
       //phone ss=new phone();
       //ss.name();
       //smartphone ssm=new smartphone();
      // ssm.name();
        phone obj=new smartphone();
       // smartphone obj=new phone();//NOT ALLOWED-- IMPORTANT
        obj.name();//object ka name run hoga that is smartphone ka name run hoga
       //obj.wish();//not allowed qki reference super class ka h ie phone ka h
        obj.greet();
    }
}

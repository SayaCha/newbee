//output is according to comments i have made
class Ekcls
{
    Ekcls(int f) //constructor
    {
        this.a=f;
        System.out.println(f);
    }
    int a;
    public int getA()
    {
        return a;
    }
     Ekcls()  //constructor
    {
        System.out.println("its me again!");

    }

}
class Recls extends Ekcls  //important
{
    Recls()
    {
       // super(c);
        System.out.println("i am a custructor!");
    }
    Recls(int f)
    {
        super(f);
        System.out.println("recls overloaded!");
    }

}
public class ThisNSuper {
    public static void main(String[] args)
    {
        Ekcls ek=new Ekcls(37);//37
        //System.out.println(ek.getA());
        Recls e=new Recls(6);//6+recls overloaded
        Recls d=new Recls();//its me again + i am a constructor
        //System.out.println(ek.getA());
    }
}

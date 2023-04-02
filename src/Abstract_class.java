abstract class base3
{
    public  base3(){
        System.out.println("i am a consturctor of class base ");
    }
    public void sayHero()
    {
        System.out.println("Hello!");
    } // abstract cls ka method
    abstract public void greet();
    abstract public void greet2();
}
abstract class child3 extends base3
{
    public void th()
    {
        System.out.println("i am nasty !!!!!!!");
    }
}
class child2 extends base3
{
    @Override
    public void greet()
    {
        System.out.println("good morning!");
    }//override krk student class ko abstrct bnane se bcha skte hai

    @Override
    public void greet2() {
        System.out.println("good afternoon!");
    }
}
public class Abstract_class
   {
    public static void main(String[] args)
    {
        child2 ch = new child2();
        // child3 ch2=new child3() ;// gives an error as it is an abstract class
    }
}
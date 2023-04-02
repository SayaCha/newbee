class A
{

    public int a;
    public int harry()
    {
        return 4;
    } //method
    public void meth2()
    {
        System.out.println("i am method2 of class A");
    }//method2
}
class B extends A//inheritance
{
    @Override // tells you that following method is override and if it is not then gives error
   public void meth2()
   {
       System.out.println("i am method2 of class B ");
   }

    public void meth3()
    {
        System.out.println("i am a method3 of class B");
    } //not overriden
}
public class Method_overriding
{
    public static void main(String[] args)
    {
        A a=new A(); //object creation
        a.meth2();//object bnake call krte hai methods ko (class ke methods ko)
        B b=new B();
        b.meth2();
    }
}

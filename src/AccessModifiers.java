class c1
{
    public int x=9;
    protected int u=0;
    int v=0;//no modifier
    private int h=8;
    public void meth1()
    {
        System.out.println(x);
        System.out.println(h);
    }
}
class c2 extends c1
{
    //System.out.println(h);
    //System.out.println(v);
    public void meth2()
    {
        System.out.println(x);
        //System.out.println(h); -- gives an error.
    }
}
public class AccessModifiers {
    public static void main(String[] args)
    {
        c1 nh=new c1();
        nh.meth1();
        // System.out.println(nh.h); -- cannot access private variable
        c2 ch=new c2();
        ch.meth2();
    }
}

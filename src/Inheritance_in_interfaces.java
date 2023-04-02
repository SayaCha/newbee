interface sampleInterface
{
    void meth1();
    void meth2();
}
// ek interface ko extend krk dusri class nhi bna skte
interface sampleChild extends sampleInterface
{
    void meth3();
    void meth4();
}
class mysample implements sampleChild{
    @Override
    public void meth3() {
        System.out.println("meth3");
    }
    public void meth4()
    {
        System.out.println("meth4");
    }

    @Override
    public void meth1() {
        System.out.println("meth1");
    }
    public void meth2()
    {
        System.out.println("meth2");
    }
}
public class Inheritance_in_interfaces {
    public static void main(String[] args) {
           mysample y=new mysample();
           y.meth1();
    }
}

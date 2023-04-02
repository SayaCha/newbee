class Aa{
    int z;
    public void f1(){
        System.out.println("print me Aa");
    }
}
class Bb extends Aa{
    int z;
   public void f1(){
        //System.out.println("print me Bb");
        super.f1();
    }
    public void f2()
    {
        int z;
        z=9;
        this.z=9;//local variable
        super.z=8;//child cls wala z
    }

}
public class S_Super {
    public static void main(String[] args) {
        //Bb obj=new Bb();
        Aa on=new Bb();
        //obj.f1();
        on.f1();
    }
}

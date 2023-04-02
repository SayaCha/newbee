interface Bicycle{
    final int a=45; //(final nhi lgaya to bhi chlega qki by default final hoti h value)


    public void applybreak(int decrement);
     void applyspeed(int increment); //ye dono(sare methods) methods ko implement krna hi pdega!
}
interface HornBicycle{
    void blowHornking();
    void blowHornn();
}
interface b extends Bicycle,HornBicycle
        {}
class Herculus implements Bicycle,HornBicycle
{
    final int a=5;// is value ko change nhi kiya toh chlta hai if there is no need
    void blowhorn()
    {
        System.out.println("pii pii");
    }
    public void applybreak(int decrement){
        System.out.println("applybreak");
    }
    public void applyspeed(int increment){
        System.out.println("increase speed");
    }
    public void blowHornking()
    {
        System.out.println("blow horn");
    }
   public void blowHornn() {
        System.out.println("blow horn please");
    }
}
class v extends Herculus implements b{}
public class Interfaces {
    public static void main(String[] args) {
             Herculus mycycle=new Herculus();
             Bicycle bn=new Herculus();//interface ka refrence variable bna// vohi methods chlenge jo Bicycle me hai
             mycycle.applybreak(90);
             //you can create properties in interfaces
             System.out.println(mycycle.a);
             //you cant modify the properties in interface as they r final
             // mycycle.a=89; --gives error
             mycycle.blowHornn();
             mycycle.blowHornking();
    }
}

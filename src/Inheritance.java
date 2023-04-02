 /* class base{
    int x;
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        System.out.println("i am in base now and setting x now");
        this.x = x;
    }

    public void base(int a)
    {
        this.x=a;
        System.out.println("i am a constructor!");
    }
}
        class derived extends base{  //inheritance
            int y;
            public int getY() {
                return y;
            }
            public void setY(int y) {
                this.y = y;
            }
        }
public class Inheritance {
    public static void main(String[] args) {

        // creating an object of base class
        base b=new base();
        b.base(9);
        b.setX(8);
        System.out.println(b.getX());

        //creating a class of derived class
        derived c=new derived();
        c.setY(6);
        System.out.println(c.getY());
    }
}*/

 class baseclass{
     private int reg;

     public void setReg(int re) {
         this.reg = re;
     }
     public int getReg()
     {
         return reg;
     }
     public void baseclass()
     {
         reg=12;
         System.out.println(reg);
     }
 }
 class derived extends baseclass
 {
     int roll;

     public void setRoll(int roll) {
         this.roll = roll;
     }

     public int getRoll() {
         return roll;
     }
 }
public class Inheritance
{
    public static void main(String[] args)
    {
        baseclass me=new baseclass();
        derived you=new derived();
        me.baseclass();
        you.setRoll(89);
        System.out.println(you.getRoll());
        //System.out.println(you.getReg());
    }
}
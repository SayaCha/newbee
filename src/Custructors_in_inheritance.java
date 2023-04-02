
/*class Base1
{
    Base1()
    {
        System.out.println("I am a constructor");
    }
    Base1(int a) //constructor overloading
    {
        System.out.println("I am a constructor overloaded with " + a);
    }
    public int x;
    public void setX(int x)
    {
        this.x = x;
    }
    public int getX()
    {
        return x;
    }
}
class Derived1 extends Base1
{
    Derived1()
    {
       // super(0);
        System.out.println("i am a derived class constructor");
    }
    Derived1(int x,int y) //derived overloaded
    {
        super(x);// super class ke constructor ko call kro ie base class ke constructor
        System.out.println("i am a derived class constructor overloaded with value "+ y );
    }
    public int y;
    public void setY(int y)
    {
        this.y=y;
    }
    public int getY()
    {
        return y;
    }
}
class ChildofDerived extends Derived1{
    ChildofDerived()
    {
        System.out.println("i am a child!!");
    }
    ChildofDerived(int x,int y,int z)
    {
        super(x,y);
        System.out.println("i am an overloaded constructor of Derived with value of z as : "+z);
    }
}
public class Custructors_in_inheritance {
    public static void main(String[] args) {
         Base1 in= new Base1();
         //Derived1 ee=new Derived1();
         Derived1 de=new Derived1(8,9); //base class ka constructor phle run hota h then derived class ka!
        // overloaded constructor will not run when super is not used
         Derived1 dp=new Derived1(3,8);//overloaded base class phle run hota h fir derived class
         ChildofDerived ch=new ChildofDerived(7,8,9);
    }
}
*/
// example 2:
 class grandp
        {
            private int age;
            public void setAge(int a)
            {
                this.age=a;
            }
            public int getAge()
            {
                return age;
            }
            grandp()
            {
                System.out.println("I am grandp constructor");
            }
            grandp(int a)
            {
                System.out.println("i am grandp overloaded constructor "+a);
            }


        }
        class parents extends grandp
        {
            private int youngage;

            @Override
            public void setAge(int b) {
                super.setAge(b);
            }

            @Override
            public int getAge() {
                return super.getAge();
            }
            parents()
            {
                //super();
                System.out.println("i am parents constructor");
            }
            parents(int a)
            {
               // super(a);
                System.out.println("i am parents overloaded constructor "+a);
            }

        }
        public class Custructors_in_inheritance
        {
            public static void main(String[] args)
            {
                grandp aji=new grandp();
                parents mom_papa=new parents(9);

            }
        }

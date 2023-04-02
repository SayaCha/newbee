class Sqaure{
   /* int id;
    String name;
    int salary;
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setNAME(String n)
    {
        name=n;
    }*/
    int side;
    public float area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}
public class ClassPractise {
    public static void main(String[] args) {
       /*Java harry=new Java();
       harry.setNAME("sndjvn");
       harry.salary=12;
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
*/     Sqaure sq=new Sqaure();
        sq.side=12;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}

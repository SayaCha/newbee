
/*class Employee
{
    int id;
    String name;
    int salary;
    public int getSalary()
    {
        System.out.println("my salary is "+salary);
        return salary;
    }
    public void printde()
    {
        System.out.println("my name is "+ name);
        System.out.println("my id is "+ id);
    }
}
public class Classes {

    public static void main(String[] args)
    {
        System.out.println("this is our custom class");
        Employee harry=new Employee(); // created object
        Employee john=new Employee();
        harry.id=12;
        harry.name="salina";
        harry.salary=34;

        john.id=23;
        john.name="dest";
        john.salary=45;

        harry.printde();
        john.printde();
        int salary1= john.getSalary();
        int salary2=harry.getSalary();

       // System.out.println(harry.id);
       // System.out.println(harry.name);
    }
}
*/
class ClassRoom{

    public int reg_no(int id)
    {
        return id;
    }
    public String ur_name(String name)
    {
        return name;
    }

    String name_c;
    public String course()
    {
        return name_c;
    }
}
public class Classes {
    public static void main(String[] args) {
        ClassRoom mina=new ClassRoom();
        ClassRoom gita=new ClassRoom();
        System.out.println(mina.reg_no(19010));
        System.out.println(mina.ur_name("mina"));
        mina.name_c="science";
        System.out.println(mina.course());
        System.out.println(gita.reg_no(19011));
        System.out.println(gita.ur_name("gita"));
        gita.name_c="maths";
        System.out.println(gita.course());
    }
}
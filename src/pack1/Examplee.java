package pack1;
import pack2.Student;//import pack2.* --imports all the classes of package pack2
public class Examplee {
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.setRollno(90);
        s1.setName("Sayali");
        System.out.println("Roll No:"+ s1.getRollno());
        System.out.println("Name:"+ s1.getName());
    }
}

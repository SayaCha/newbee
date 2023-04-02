/*class Temp
{
    private int no;
    private String add;
    public void setNo(int n) {
        this.no = n;
    }
    public int getNo()
    {
        return no;
    }

    public void setAdd(String str) {
        this.add = str;
    }
    public String getAdd()
    {
        return add;
    }
}
public class Practise_Acc_con {
    public static void main(String[] args)
    {
        Temp chawane=new Temp();
        Temp chaudhary=new Temp();
        chawane.setNo(2);
        chawane.setAdd("21,Sanmarg Nagar");
        System.out.println(chawane.getNo());
        System.out.println(chawane.getAdd());
        chaudhary.setNo(3);
        chaudhary.setAdd("19,Sanmarg Nagar");
        chaudhary.getNo();
        chaudhary.getAdd();
    }
}
*/

class temp1
{
    private int id;
    private String name;
    public temp1() //constructor
    {
        id=45;
        name="LearningJava";
    }
    public temp1(int i,String str) //constructor overloadinng
    {
        this.id=i;
        this.name=str;
    }
    public void setId(int i)
    {
        this.id=i;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String str)
    {
        this.name=str;
    }
    public String getName()
    {
        return name;
    }
}
public class Practise_acc_and_con
{
    public static void main(String[] args)
    {
        temp1 me  = new temp1();
        temp1 you = new temp1(56,"PRATIKSHA");
        //me.setId(34);
        //me.setName("SAYALI CHAWANE");
        System.out.println(me.getId());
        System.out.println(me.getName());
        System.out.println(you.getId());
        System.out.println(you.getName());
    }
}

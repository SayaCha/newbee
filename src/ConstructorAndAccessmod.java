
class Myemployee
{
        private int id;
        private String name;
        public Myemployee() //constructor
        {
             id=45;
             name="your name here";
        }
      public Myemployee(String myname, int myid) //constructor overloading
      {
              id=myid;
              name=myname;
      }
        public String getName(){return name;} //accessing private variable 'name'
        public void setName(String n){this.name=n;}

        public void setId(int i){this.id=i;}
        public int getId(){return id;}

    }
    public class ConstructorAndAccessmod
    {
    public static void main(String[] args)
    {
        Myemployee harry=new Myemployee("gangg",56);
        Myemployee sas=new Myemployee(); // for constructor overloading
        sas.setId(12);
        sas.setName("shila");
        System.out.println(sas.getName());
        System.out.println(sas.getId());
        //harry.setName("sayali");
        //harry.setId(56);
        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}

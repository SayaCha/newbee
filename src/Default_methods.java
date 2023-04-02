interface camera
{
    void Takesnap();
    void recordvid();
    default void record4K() //implement krne ki garaj nhi hai
    {
        System.out.println("recording in 4K");
    }
}
interface wifi
{
     String[] getNetwork(); //String[] getNetwork();
     void connectTonetwork(String network);
}
class Mycellphone
{
   // public void Takesnap()
   // {System.out.println("taking a snap!");}
    void Callnumber (int phnno)
    {
        System.out.println("Calling.."+phnno);
    }
    void pickCall()
    {
        System.out.println("Connecting!");
    }
}
class Smartphn extends Mycellphone implements wifi,camera
{
   public void Takesnap()
   {
       System.out.println("Took snap");
   }
   public void recordvid()
   {
       System.out.println("vid recorded");
   }
   public String[] getNetwork()
    {
        System.out.println("getting list of networks");
        String[] networklist={"harry","anjali","mayuri"};
        return networklist;
    }
    private void greet()
    {
        System.out.println("morning!");
    }
   public void record4K() //override kiya default method ko aur yhi method chalega override kiya hua
    {
        greet();
        System.out.println("recording in 4K and saving");
    }
   public void connectTonetwork(String network)
   {
       System.out.println("connecting to "+ network);
   }
}
public class Default_methods
{
    public static void main(String[] args)
    {
         Smartphn pn=new Smartphn();//sirf class ka object bnta hai
         pn.record4K();
        //pn.greet();--gives an error
         String[] ar=pn.getNetwork();
         for(String item: ar)
         {
             System.out.println(item);
         }
    }
}
//interface mein static aur default methods ho skte hain,static method object se associated nhi hota hai,
// wo associated hota hai ek class se ya ek interface se.
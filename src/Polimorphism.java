interface  camera2
{
    void Takesnap();
    void recordvid();
    default void record4K() //implement krne ki garaj nhi hai
    {
        System.out.println("recording in 4K");
    }
}
interface wifi2
{
    String[] getNetwork(); //String[] getNetwork();
    void connectTonetwork(String network);
}
class Mycellphone2
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
class Smartphn2 extends Mycellphone2 implements wifi2,camera2
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
public class Polimorphism
{
    public static void main(String[] args)
    {
        camera2 cam1=new Smartphn2();//this is a smartphn ,use it as camera
        //cam1.getNetwork();--wrong
        cam1.record4K();
        cam1.recordvid();
        //cam1.greet(); --because not being used as smartphone
        Smartphn2 s=new Smartphn2();//can only use smartphone methods
        s.connectTonetwork("me");
    }
}

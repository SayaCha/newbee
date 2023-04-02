import java.util.*;
public class Cursors
{
    public static void main(String[] args)
    {
        Vector v=new Vector();
        v.addElement("o1");
        v.addElement("o2");
        v.addElement("O33");
        System.out.println(v);
        Enumeration e= v.elements();//sirf vector aur stack k liye
        while(e.hasMoreElements()){
            String s=(String)e.nextElement();
            System.out.println(s+" "+s.length());
        }
    }
}

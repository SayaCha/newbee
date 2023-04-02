import java.util.*;
public class Collection {
    public static void main(String[] args) {
        ArrayList l1=new ArrayList(5);
        l1.add("sheela");
        l1.add("awnti");
        l1.add(1,"romesh");
        Iterator it=l1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}

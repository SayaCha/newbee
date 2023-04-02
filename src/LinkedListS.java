import java.util.*
        ;
public class LinkedListS
{
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add("c");
        l1.add("cpp");
        l1.add("php");
        l1.add("java");
        System.out.println(l1);
        ListIterator lit=l1.listIterator();
        while(lit.hasNext()){String s=(String)lit.next();
        if(s.equals("java")){lit.set("java set");}
        else if(args.equals("c")){lit.add("DSA");}
        }System.out.println(l1);
    }
}

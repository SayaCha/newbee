import java.util.ArrayList;
import java.util.*;
public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(63);
        l2.add(58);
        l2.add(69);
        l2.add(90);
        l1.add(7);
        l1.add(3);
        l1.add(8);
        l1.add(9);
        l1.add(1);
        l1.add(0,9);
        l1.addAll(3,l2);
        System.out.println(l1.contains(9));
        System.out.println(l1.indexOf(9));
        System.out.println(l1.lastIndexOf(9));
        l1.addLast(88);//YE METHOD LINKEDLIST MEIN HAI ARRAYLIST ME NHI HAI
        l1.set(1,12);
        //l1.addAll(l2);--adds all the elements of l2 at the end
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(" ");
        }
    }
}

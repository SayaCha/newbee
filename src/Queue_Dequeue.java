import java.util.*;
public class Queue_Dequeue
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(5);
        ad1.add(45);
        ad1.addFirst(4);
        System.out.println(ad1.getFirst());
    }
}

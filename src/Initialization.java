public class Initialization {
    private int x;
    {
        System.out.println("initialization block:"+x);
        x=5;
    }
    public Initialization(){
        System.out.println("constructor:x"+x);
    }

    public static void main(String[] args) {
        Initialization t1=new Initialization();
        Initialization t2=new Initialization();
    }
}

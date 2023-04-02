public class Static {
    private static int k;
    static {
        System.out.println("static initialization block=k:"+k);
        k=10;
    }

    public static void main(String[] args)
    {
        new Static();
    }
}

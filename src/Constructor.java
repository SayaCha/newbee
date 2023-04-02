public class Constructor {
    private int l,b,h;
    public Constructor()
    {
        l=10;
        b=8;
        h=8;
    }
    public Constructor(int L,int B,int H){l=L;b=B;h=H;}//CONSTRUCTOR OVERLOADING
    public static void main(String[] args) {
        Constructor b1=new Constructor();
        Constructor b2=new Constructor(6,8,9);
    }
}

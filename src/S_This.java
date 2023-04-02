class Exa {
    private int l,b,h;
    public void setDimention(int l,int b,int h)//instanance member function
    {
        this.l=l;
        this.b=b;
       this.h=h;
    }
    public void SendBox()
    {
        //Gifttaker gf=new Gifttaker();
        //gf.acceptgift(this);
    }

}
public class S_This{
    public static void main(String[] args)//static member function
    {
        Exa s1=new Exa();
        s1.setDimention(34,66,78);
        s1.SendBox();
    }
}

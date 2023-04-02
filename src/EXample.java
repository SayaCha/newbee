  class Class
{
   private int le,be,he;
   public void setDimension(int l,int b,int h)
   {
       le=l;
       be=b;
       he=h;
   }
   public void showDimension()
   {
       System.out.println("L="+le);
       System.out.println("B="+be);
       System.out.println("H="+he);
   }
}
 public class EXample
 {
    public static void main()
    {
        Class smallBox=new Class();//garbage block
        smallBox.setDimension(6,8,9);
        smallBox.showDimension();
        smallBox =new Class();
        smallBox.showDimension();
    }
}

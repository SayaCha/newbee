class sphere{
    private int r;
    public void getR(int r){this.r=r;}
    public int setR(){return r;}
    public double volume()
    {
        return (4/3)*Math.PI*r*r*r;
    }
    public double area()
    {
        return 4*Math.PI*r*r;
    }
}
public class Exersice {
    public static void main(String[] args)
    {
        sphere s=new sphere();
        s.getR(4);
        System.out.println(s.volume());
        System.out.println(s.area());
    }
}

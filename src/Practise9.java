/*class cyliner
{
    private int radius;
    private int ht;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHt() {
        return ht;
    }

    public void setHt(int ht) {
        this.ht = ht;
    }
    public double surarea()
    {
        return 2*3.14*radius + 2*3.14*radius*ht;
    }
}*/
class rectangle
{
    private int l;
    private int b;
    public rectangle()
    { this.l=4;
        this.b=5;
    }
    public rectangle(int lenghth,int breadth)
    {
        this.l=lenghth;
        this.b=breadth;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
public class Practise9 {
    public static void main(String[] args) {
      /*cyliner mycil=new cyliner() ;
      mycil.setHt(12);

        System.out.println(mycil.getHt());
        mycil.setRadius(78);
        System.out.println(mycil.getRadius());*/

        // problem no. 2
        //simple

        //problem 3
        rectangle r=new rectangle(12,45);
        System.out.println(r.getL()
        );
        System.out.println(r.getB());
    }
}


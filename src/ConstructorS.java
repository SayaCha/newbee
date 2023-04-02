import org.w3c.dom.ls.LSOutput;

class Av{
    public Av(int y){
        int a=y;
        System.out.println("a");
    }
}
class Bv extends Av{
    public Bv(){
        super(7);
        System.out.println("b");
    }
}
public class ConstructorS {
    public static void main(String[] args) {
        Bv obj=new Bv();
    }
}

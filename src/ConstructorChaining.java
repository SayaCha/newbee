 class As{
    public As(){
        System.out.println("A1");
    }
}
class Bc extends As{
    public Bc(){
        this(3);
        System.out.println("B1");}
    public Bc(int x){
        System.out.println("B2");
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
      Bc obj=new Bc();
        
    }
}

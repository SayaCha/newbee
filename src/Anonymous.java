class Greeting{
public void f1(){
    System.out.println("hello");
}
}
class India{
Greeting g=new Greeting(){
public void Greeting(){
    System.out.println("Namaste");
}
}; // an instance of anonumous class
    //anonumous claa is subclass of greeting
}
public class Anonymous {
    public static void main(String[] args) {
        India id=new India();
        id.g.f1();
    }
}

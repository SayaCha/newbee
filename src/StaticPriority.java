 class Parent {
    static int y=9;

}
class child extends Parent{
    static { y=8;}
}
public class StaticPriority{
    public static void main(String[] args) {

        System.out.println(child.y);//parent ka y chla qki static member inherit nh hote
    }
}
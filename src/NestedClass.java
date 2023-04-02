/*
class outer{

    int x;
    void f1(){

    }
    static class inner{
        void if1(){
            System.out.println("if1");
            //System.out.println("if1"+x); cannot aceess x as it is not static if it was static it could access it
        }
    }

}
public class NestedClass
{
    public static void main(String[] args) {
        outer.inner obj=new outer.inner();
        obj.if1();
    }
}
*/
class outer{
    int x=90;
    void f1(){

    }
     class inner{
        void if1(){
            System.out.println("if1"+x);
        }
    }

}
public class NestedClass
{
    public static void main(String[] args) {
        outer out=new outer();
        outer.inner obj=out.new inner();
        obj.if1();
    }
}
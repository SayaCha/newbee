public class GenericMethods {
    public <E> void printArray(E[] s)
    {
        for( E x:s){
            System.out.println(x);
        }
    }


    public static void main(String[] args) {
        GenericMethods o1=new GenericMethods();
        String country[]=new String[]{"INDIA","NEPAL","BHUTAN"};
        Integer numbers[]={23,67,67,78};
        o1.printArray(country);
        o1.printArray(numbers);
    }
}


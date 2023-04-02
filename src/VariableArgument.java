
public class VariableArgument {
    static int sum(int...arr) //important
    {
        int result=0;
        for(int a:arr)
        {
            result=result+a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(34,43,56,76,65));
    }
}

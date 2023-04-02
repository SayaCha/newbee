public class CommandLineArgument
{
    public static void main(String []args) {
        int s = 0;
        int i;
        for (i = 0; i < args.length; i++)
        //System.out.println(args[i]);//args--denotes string
        s = s +Integer.parseInt(args[i]);
        System.out.println("sum is "+s);
    }
}

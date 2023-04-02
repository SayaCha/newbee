public class FinallyBlock {
    public static int greet() {
        try {
            int a = 2;
            int b = 2;
            int c = a / b;
            return c;
        }
        catch (Exception e)
        {
            System.out.println(e);
        } finally {
            System.out.println("this is the eop!");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        int a = 0;
        int b = 9;
        while (true) {
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            } finally {
                System.out.println("i am final block");
            }
            b--;
        }
    }
}
//try+catch
//try+finally block
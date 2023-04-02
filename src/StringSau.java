public class StringSau {
    public static void main(String[] args) {
        String s1="computer";
        String s2="computer";
        String s3=new String("computer");
        System.out.println(s1==s2);//rwerences compare hue
        System.out.println(s1.equals(s2));//string compare hue
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}

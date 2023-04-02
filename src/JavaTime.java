import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaTime
{
    public static void main(String[] args)
    {
        LocalDate l= LocalDate.now();
        System.out.println(l);
        LocalTime k=LocalTime.now();
        System.out.println(k);
        LocalDateTime de=LocalDateTime.now();
       System.out.println(de);
    }
}

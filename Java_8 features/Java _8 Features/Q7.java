// Period in java 
import java.time.LocalDate;
import java.time.Period;    
public class Q7 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(1990,2,2);
         Period period = Period.between(now, then);
         System.out.println(period); // Output m P-35Y-10M-26D ye aagya    

    }
}

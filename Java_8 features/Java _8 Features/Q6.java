// Duration in java 8  
// Difference nikalne ke liye Duration ka use karte h 
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class Q6 {
    public static void main(String[] args) {
       Instant start = Instant.now();
       Instant end = Instant.now();
      Duration d1 =  Duration.between(start, end);
       System.out.println(d1);    // PT0S PT matlab Period of Time 
       
       Duration d2 = Duration.of(1,ChronoUnit.MILLIS);
       System.out.println(d2); // Output m ye aagya PT0.001S 

       // aab hum compare karenge two durations ko 
       int i = d1.compareTo(d2);
       System.out.println(i);         

         LocalDateTime a = LocalDateTime.now();
         LocalDateTime b = LocalDateTime.now();
         Duration between = Duration.between(a,b);    
         System.out.println(between);      // Output m 0 second aagya 

     }
}

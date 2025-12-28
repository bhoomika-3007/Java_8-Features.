// ZonedDateTime in java 8 
// ZonedDateTime bilkul same h LocalDateTime ki tarah
// iss m bss Zone Include hota h 
import java.time.ZoneId;
import java.time.ZonedDateTime;     
public class Q4 {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now); // output m ye aagya 2025-12-28T09:49:10.133172200+05:30[Asia/Calcutta]  
  ZonedDateTime NewYorkDateTime = ZonedDateTime.of(2000, 12, 1, 14, 30,30,20,ZoneId.of("America/New_York"));
  System.out.println(NewYorkDateTime);   

  ZonedDateTime newYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
  System.out.println("Current time in New York " + newYork);  // ye current time bata dega new york ka 


    }
}

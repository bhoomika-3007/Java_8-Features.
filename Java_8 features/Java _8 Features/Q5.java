// Instant time in java 8 
import java.time.Instant; 
public class Q5 {
    public static void main(String[] args) {
        
        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);  // ye milli seconds deta h 1766896601976   

        // aab use karenge Instant ka 
        Instant now = Instant.now();
        System.out.println(now); // output m ye aagya 2025-12-28T04:36:41.977865900Z 
     }
}

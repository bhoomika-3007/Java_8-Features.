// Set ek interface h in java 
// Agar chije hume order m rakhni h tho hum tree set ka use karte h  
import java.util.*;
public class G1 {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(22);
        s.add(1);
        s.add(13);
        System.out.println("Before Manual Sorting "+ s); // ye asscending order m output dega 
        Set<Integer> ss = new TreeSet<>((a,b) -> b  -a );   // Ye h Lambda Expression in java   
        ss.add(22);
        ss.add(1);
        ss.add(13);
        System.out.println("After Manual Sorting " + ss);   // Ye descending order m output dega  

        
    }
     
}

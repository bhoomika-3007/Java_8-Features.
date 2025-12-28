// Local time in java 
import java.time.LocalTime; 
public class Q2 {
    public static void main(String[] args) {
          LocalTime time = LocalTime.now();
          System.out.println(time); 
// Cusotme time bhi bana sakte h 
// Custome time banane ke liye of ka use karte h hum 

LocalTime time1 = LocalTime.of(14,30,30);
System.out.println(time1); 

// aagar aap ke pass string h tho 
   
          String timeinString = "15:30:45";
          LocalTime parsedTime = LocalTime.parse(timeinString); 
          System.out.println(parsedTime); // ye hi time aagya 
          LocalTime localTime1 = time.minusHours(1); 
          System.out.println(localTime1);   // ye ek hour minus kar dega current time me se 
    }
}
   
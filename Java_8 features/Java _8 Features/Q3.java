// Local DateTime; 
import java.time.LocalDateTime;    
public class Q3 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);  // ye date or time dono ko ek sath print kara dega 

        // Custome LocalDate and Time bhi bana sakte h of ka use kar ke 

        LocalDateTime time = LocalDateTime.of(2022,7,3,9,44,6);  
        System.out.println(time); 
  
        // parse ka use kar sakte h 

        LocalDateTime mydate = LocalDateTime.parse("2023-01-11T13:48"); // ye time m convert ho jagya string se 
        System.out.println(mydate);
  
    }
}

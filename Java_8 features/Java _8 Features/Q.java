// Date and Time API in java 8 
// LocalDate -----> Represents a date without a time zone  
import java.time.LocalDate; 
import java.time.Month; 

public class Q {
    public static void main(String[] args) {
 // aagar mujhe current system date chiye 
     LocalDate now = LocalDate.now();
     System.out.println(now); // current date print kara dega 
     
     // lekin mujhe custom date banai h 
     LocalDate customdate = LocalDate.of(1990,2,7);  
     System.out.println(customdate);  // iss se khud ke date ban jagyi 

     // hum day , month or year ko alag alag bhi print kara sakte h 

     int dayOfMonth = now.getDayOfMonth();
     Month month = now.getMonth();
     int year = now.getYear();
    
        System.out.println(dayOfMonth); // 28 
        System.out.println(month); // December 
        System.out.println(year);     // 2025 

        
    }
    
}

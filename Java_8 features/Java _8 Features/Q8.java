// DateTimeFormatter in java 8 
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Q8 {
    public static void main(String[] args) {
        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);  
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        String format = t1.format(myFormatter);
        System.out.println(format); // 28/12/2025 iss format m date aa jayegi 



    // aab maan no humare pass Date string m or hume usse local format m convert karna h 
    String date = "25/04/1998";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate parse = LocalDate.parse(date,dateTimeFormatter);
    System.out.println(parse);  // date local format m print ho jagyi 1998-04-25    
          
     }
}

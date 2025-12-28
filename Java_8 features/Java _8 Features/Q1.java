import java.time.LocalDate; 
// LocalDate in java 8  

public class Q1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        // aaj ki date se hum kal ki date nikalna chathe h 
          LocalDate customDate = LocalDate.of(1990, 2, 7);
        System.out.println("Yesterday Date: " + today.minusDays(1));
        

    // aab karenge 100 mahine puranie date ko print 
    LocalDate pastdate = today.minusMonths(100);
    System.out.println(pastdate); // output m 2017-08-28 aa jagya  


    }
}

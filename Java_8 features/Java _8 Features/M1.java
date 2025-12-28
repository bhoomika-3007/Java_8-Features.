// BiFunction in java 
// Function kaam kar ke lata h 
import java.util.function.BiFunction;  

public class M1 {
    public static void main(String[] args) {
       BiFunction<String, String, Integer> biFunction = (x,y) -> x.length() + y.length(); 
      System.out.println(biFunction.apply("Hi", "Hello"));  // Output m 7 aagya     
    }
}

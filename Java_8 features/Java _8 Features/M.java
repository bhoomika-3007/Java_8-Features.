// BiPredicate in java
// agar humare pass two arguments h thab hum Bipredicate ka use karenge 
// Predicate sirf condition check karta h 
import java.util.function.BiPredicate;   
public class M {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (x,y) -> x % 2 ==0 && y%2 ==0;
        System.out.println(biPredicate.test(2,4));  // output m true aagya 
        
      BiPredicate<String, Integer> biPredicate1 = (str, s) -> str.length() ==s;
      System.out.println(biPredicate1.test("Vipul", 5));   // Output m true aagya    
      
    }
}

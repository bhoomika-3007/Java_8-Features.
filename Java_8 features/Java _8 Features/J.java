// Function in java 8 
// Function bhi ek Functional Interface h in java 8  
// Function kaam kar ke lata h ye condition check nahi karta h 
import java.util.function.Function; 
public class J {
 public static void main(String[] args) {
      Function<String, Integer> function = x -> x.length();
     System.out.println(function.apply("Vipul")); // ye String ke length print kara dega  
     // aab ye output me bhi string lake dega 
     Function<String , String> function1 = s -> s.substring(0,3);  
     System.out.println(function1.apply("Vipul"));         // ye first three characters print kara dega    
          
 }
}

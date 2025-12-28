// UnaryOperator in java
// Unary ke matlab hota h ki Interger Input dinge tho Integer hi output aagya  
// Hum String ka bhi unary Operator bana sakte h 
import java.util.function.UnaryOperator;  
public class N {
  public static void main(String[] args) {
    UnaryOperator<Integer> unaryOperator = x -> x *x;
    System.out.println(unaryOperator.apply(5));    // Output m 25 aa jagya  
     UnaryOperator<String> unaryOperator1 = str -> str.toLowerCase();
     System.out.println(unaryOperator1.apply("VIPUL"));    // output m sab khuch lowercase m aagya vipul 
    
  }
    
}

// Supplier Interface in java
// iss m bss ek hi method h 
// Supplier ek functional Interface h 
// iss m bss get method h 
import java.util.function.Supplier; 

public class L {
  public static void main(String[] args) {
     Supplier<Integer> supplier =   ()-> 1; 
     System.out.println(supplier.get()); // output m 1 aagya  
   }   
}

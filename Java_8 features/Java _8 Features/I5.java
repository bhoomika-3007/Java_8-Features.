// negate predicate in java 8 
// Ye negate kar dega jo bhi name V se start h 
// Predicate me method ha test   

import java.util.function.Predicate;

public class I5 {
   public static void main(String[] args) {
        Predicate<String> startsWithLeterV = x -> x.toLowerCase().charAt(0)=='v';
         System.out.println(startsWithLeterV.negate().test("Vipul"));   // output m false aagya    
         System.out.println(startsWithLeterV.negate().test("Kunal"));  // aab output m aagya true      
   }     
}

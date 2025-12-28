// Or predicate in java 
// koi ek condition true honi chiye or m 

import java.util.function.Predicate;

public class I4 {
    public static void main(String[] args) {
             Predicate<String> startsWithLeterV = x -> x.toLowerCase().charAt(0)=='v';
        Predicate<String> endsWithLeterL = x -> x.toLowerCase().charAt(x.length() - 1)=='l';  
        Predicate<String> or = startsWithLeterV.or(endsWithLeterL);  // or  ka use kiya h humne yaha pe   
         System.out.println(or.test("Vivek")); // Output m True aagya   
    }     
}
 
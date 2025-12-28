// default and static methods inside Predicate interface in java 
// and predicate in java 

import java.util.function.Predicate;

public class I3 {
    public static void main(String[] args) {
         
        Predicate<String> startsWithLeterV = x -> x.toLowerCase().charAt(0)=='v';
        Predicate<String> endsWithLeterL = x -> x.toLowerCase().charAt(x.length() - 1)=='l';  
        Predicate<String> and = startsWithLeterV.and(endsWithLeterL);  // and ka use kiya h humne yaha pe   
         System.out.println(and.test("Vipul")); // Output m True aagya   
    }
}

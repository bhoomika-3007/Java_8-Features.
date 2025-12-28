// isEqual Predicate in java 8   

import java.util.function.Predicate;

public class I6 {
    public static void main(String[] args) {
       Predicate<Object> predicate = Predicate.isEqual("Vipul");
        System.out.println(predicate.test("hello"));   // output m aagya false
        System.out.println(predicate.test("Vipul"));  // abb output m aagya true    
    }    
    
}

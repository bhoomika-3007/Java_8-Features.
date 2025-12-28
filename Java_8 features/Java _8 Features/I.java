// Predicate in java 8 
// Predicate ek  Functional Interface h
// Functional Interface ve hota h jiss m bss ek hi abstract method hota h  
// default or static kitne bhi ho sakte h 
// Predicate ek Boolean valued Function hota h 
// Predicate condition ko hold karta h ki vo condition true hogi ya false hogi  
import java.util.function.Predicate;
public class I{
public static void main(String[] args) {
    Predicate<Integer> predicate = x -> x > 100000; // ye h lambda expression in java 
    System.out.println(predicate.test(1000000));      // Output m true aa jagya  s
}
} 
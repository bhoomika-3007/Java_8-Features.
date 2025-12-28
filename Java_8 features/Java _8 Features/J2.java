// identity in function 
// iska matlab hota h ki jo hum input m dinge vo hi output m aagya 
// function ke ander bss ek hi abstract method h apply       
import java.util.function.Function; 
public class J2 {
    public static void main(String[] args) {
        Function<String, String> identitFunction = Function.identity();
        System.out.println(identitFunction.apply("Vipul"));     // output m vipul hi aagya 
    }
}

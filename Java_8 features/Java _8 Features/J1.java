// Function Chaining in java 8 
// use of andThen in function in java 
import java.util.function.Function;   

public class J1 {
    public static void main(String[] args) {
        Function<String, String> function1 = s -> s.toUpperCase();
        Function<String, String> function2 = s -> s.substring(0,3);
        System.out.println(function1.andThen(function2).apply("vipul"));           
    }
}
    
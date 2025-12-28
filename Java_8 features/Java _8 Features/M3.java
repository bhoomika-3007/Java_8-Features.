// BiConsumer in java 8 
// Consumer khuch bhi return nahi karata h 
import java.util.function.BiConsumer; 
public class M3 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
          System.out.println(x+y);
        };
        biConsumer.accept(1, 2);  // Output m 3 aa jagya  
    }
}
           
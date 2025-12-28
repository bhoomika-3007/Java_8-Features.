// iss program h hum dhekenge ki humare jo string h vo v se start ho rhi h ya nahi 
import java.util.function.Predicate;

public class I2 {
    public static void main(String[] args) {
           
        Predicate<String> startsWithLeterV = x -> x.toLowerCase().charAt(0)=='v';
        System.out.println(startsWithLeterV.test("hello"));   // Output m false aagya
        System.out.println(startsWithLeterV.test("vipul"));   // Output m True aagya   
    }
}

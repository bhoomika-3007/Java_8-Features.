// BinaryOperator in java 8 
// Input m bhi String chiye or Output m bhi String chiye  
import java.util.function.BinaryOperator;   
public class N1 {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("Hello" , "World"));
     }
}

import java.util.function.Function;

public class J3 {
     public static void main(String[] args) {

        // Pehla function: number me 10 add karega
        Function<Integer, Integer> addTen = x -> x + 10;

        // Dusra function: number ko 2 se multiply karega
        Function<Integer, Integer> multiplyByTwo = x -> x * 2;

        // compose ka use
        int result = multiplyByTwo.compose(addTen).apply(5);

        System.out.println(result);
    }
}
    
            

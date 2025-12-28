// Stream in java 8 
import java.util.stream.Stream; 
public class P2 {
    public static void main(String[] args) {
        Integer integer = Stream.iterate(0, x -> x + 1).limit(101).map(x -> x / 20).distinct().peek(System.out::println).max((a,b) -> a-b).get();
        System.out.println(integer);  // iss m hum ne max ka use kiya h 

        // count terminal operator in java 8 

        Long integer1 = Stream.iterate(0, x-> x + 1).limit(101).map(x -> x / 20).distinct().count();
        System.out.println(integer1);    



    }
    
}

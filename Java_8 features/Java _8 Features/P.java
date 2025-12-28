// Streams in java 8   
// Collection ko hum Stream m convert kar sakte h   
// iss program m hum Banayenge Stream  
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;   

public class P {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Mango","Grapes"); // iss list ko hum ne niche next line m  Stream m Convert kar diya h 
        Stream<String> mystream = list.stream();

        String[] array = {"apple", "Mango", "Grapes"}; // iss Array ko bhi hum ne niche next line m  Stream m convert kar diya h
        Stream<String> stream = Arrays.stream(array);

        Stream<Integer> integerstream = Stream.of(1,2,3);


        Stream<Integer> limit = Stream.iterate(0, n -> n+1).limit(100);

        Stream<String> limit1 =  Stream.generate(() -> "helllo").limit(5); 
    }
    
}

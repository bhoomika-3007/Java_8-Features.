// Constructor Refrence in java 8   
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;  
public class O2  {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bob","Vipul");
        List<O1> collect = names.stream().map(O1::new).collect(Collectors.toList());   
                     
    }
    
}
  
//Optional in java 8 
import java.util.Optional;
public class R1 {
    public static void main(String[] args) {
        Optional<String> name = getName(2);
        String nameTobeUsed = name.orElse("NA");
        System.out.println(nameTobeUsed);
    }

    private static Optional<String> getName(int id){
        return Optional.empty();    
    }  
}

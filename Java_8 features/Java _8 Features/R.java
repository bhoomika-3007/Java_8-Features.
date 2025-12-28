// Optional in java 8 
// Optional m ve chije dall sakte h jo chije null ho sakti 
import java.util.Optional; 
public class R {
    public static void main(String[] args) {
        Optional<String> name = getName(2);
        if(name.isPresent()){                    // isPresent method ka use kiya h ye condition check karega 
            System.out.println(name.get());  
        }
          name.ifPresent(x -> System.out.println(x));   
         
    }
 private static Optional<String> getName(int id){
   String name = null;
   return Optional.ofNullable(name); 
 }

}

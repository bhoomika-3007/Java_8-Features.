import java.util.*;
// Abb iss m hum Map ka use karenge 
public class G2 {
    public static void main(String[] args) {
    Map<Integer , String>  m = new TreeMap<>(); // Tree order maintian karta h  
    m.put(2,"z");
    m.put(3,"f");
    m.put(1,"y");
    System.out.println("Before Manula Sorting "+ m); // Output aagya asscending order m 
    Map<Integer, String> mm = new TreeMap<>((a,b) -> b - a);  
    mm.put(2, "z");
    mm.put(3,"f");
    mm.put(1,"y");   
    System.out.println("After Manual Testing "+ mm); // Output aagya Descending order m  
    }
    
}
 
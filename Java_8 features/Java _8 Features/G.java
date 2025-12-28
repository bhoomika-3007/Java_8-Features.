// Comparator in java using Lambda Expression 
// Comparator ka use hum list ko asscending se descending order m karne ke liye use karte h with Lambda Expression in java 
// Functional Interface h Comperator matlab ki single abstract method h 
// Comperator operator m bss ek hi method h Compare      
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;    
public class G {
    public static void main(String[] args) { 
    List<Integer> l = new ArrayList<>(); 
    l.add(12);
     l.add(1);
    l.add(2);
    l.add(8);
     l.add(4);
    l.add(3);
    // Abb hum iss ko sort karenge tho collections ka use karnge sort karne ke liye   
    Collections.sort(l,(a, b) -> b - a);     // Ye h lambda Expression in java  
    System.out.println(l); 
    // aab ye descending order m list ko print kara dega  

}
} 

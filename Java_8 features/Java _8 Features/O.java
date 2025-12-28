// Method Refrences in java 
// hum method refrence ki help se lambda expression ko replace kar sakte h   
// Method refrence method ko refer karta h  
// :: <----  is ko bolte h Method refrence operator in java 8  
import java.util.Arrays;
import java.util.List;


public class O {
    public static void print(String s ){  // agar ye method kahi pe already likha hua h tho hi replace kar sakte h lambda expression ko  
        System.out.println(s);  
    }
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice", "Vipul", "Sourav");
        students.forEach(O::print); // yaha pe hum Refrence de rhe h  
        // output m tino name print ho jayenge  
    } 
    
}

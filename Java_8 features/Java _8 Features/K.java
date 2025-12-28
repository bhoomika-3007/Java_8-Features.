//Consumer Interface in java 8 
// Consumer m single extract method h  ---accept
// Consumer bss data store karata h database m 
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer; 
public class K {
    public static void main(String[] args) {
               
        Consumer<List<Integer>> listconsumer = x -> {
        for(Integer i : x){
            System.out.println(i + 100);
        }
};
         Consumer<List<Integer>> listConsumer2 = li -> {
              for(Integer i : li){
                System.out.println(i); 
              }
         };
        Consumer<List<Integer>> listConsumer = listConsumer2.andThen(listconsumer);
        listconsumer.accept(Arrays.asList(1,2,3,4));    


    }
    
}

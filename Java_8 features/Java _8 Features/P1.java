// Stream Operations in java 
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors; 
import java.util.stream.Stream; 
public class P1 {
    public static void main(String[] args) {
       List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2);  
     List<Integer> filterlist = list.stream().filter(x ->  x % 2 ==0).collect(Collectors.toList()); // iss m use kiya h filter method 
     System.out.println(filterlist); // output m bss even numbers hi print honge list ke form m  

     List<Integer> maplist1 = filterlist.stream().map(x -> x /2 ).collect(Collectors.toList()); // iss me use kiya h map method 
     System.out.println(maplist1);  // ye output m jo even numbers aaye the unnhe divide kar dega  or output m 1,2,3,4 aagya 

     List<Integer> mapist2 = filterlist.stream().map(x -> x / 2).distinct().sorted().collect(Collectors.toList()); // iss me use kiya h distinct method 
     System.out.println(mapist2);  // iss m hum ne distinct ka use kiya h ye repetation ko hata deta h 

     // aab hum chathe h ki jo humari list h vo descending ordr m aaye 
      List<Integer> mapist3 = filterlist.stream().map(x -> x / 2).distinct().sorted((a,b) -> (b -a)).collect(Collectors.toList());
     System.out.println(mapist3); // aab output m list descending order m print hogi  

     // aab hum karenge limit ka use hume bss do hi sorted element chiye 
     // aapko starting ke kitne elements chiye ye hota h limit 

       List<Integer> mapist4 = filterlist.stream().map(x -> x / 2).distinct().sorted((a,b) -> (b -a)).limit(2).collect(Collectors.toList());
     System.out.println(mapist4); // iss m hum ne use kiya h limit ka  
     // Only two element hi print honge  

     // abb use karenge skip ka 
     // aap starting se kitne elements skip karna chathe h ye hota h skip 

     List<Integer> mapist5 = filterlist.stream().map(x -> x / 2).distinct().sorted((a,b) -> (b -a)).limit(2).skip(1).collect(Collectors.toList());
     System.out.println(mapist5); // output m only 3 aagya 4 haat jagya   


    List<Integer> collect =  Stream.iterate(0, x-> x +1).limit(101).skip(1).collect(Collectors.toList());
       System.out.println(collect);    // 1 to 100 numbers print ho jayenge 

       // aab hume bss even number chiye 
       // tho filter laga dinge
        List<Integer> collect1 =  Stream.iterate(0, x-> x +1).limit(101).skip(1).filter(x -> x %2 ==0).collect(Collectors.toList());
       System.out.println(collect1); 
      

       // aab hum map ka use karnege 
        List<Integer> collect2 =  Stream.iterate(0, x-> x +1).limit(101).skip(1).filter(x -> x %2 ==0).map(x -> x / 10).collect(Collectors.toList());
        System.out.println(collect2); 

      // aab hume distinct bhi chiye 
      List<Integer> collect3 =  Stream.iterate(0, x-> x +1).limit(101).skip(1).filter(x -> x %2 ==0).map(x -> x / 10).distinct().collect(Collectors.toList());
        System.out.println(collect3);  

        // aab hume sorted bhi chiye 
       List<Integer> collect4 =  Stream.iterate(0, x-> x +1).limit(101).skip(1).filter(x -> x %2 ==0).map(x -> x / 10).distinct().sorted().collect(Collectors.toList());
        System.out.println(collect4); 
        

        // Peek bhi laga sakte h sorted ke baad 
         List<Integer> collect5 =  Stream.iterate(0, x-> x +1).limit(101).skip(1).filter(x -> x %2 ==0).map(x -> x / 10).distinct().sorted().peek(x -> System.out.println(x)).collect(Collectors.toList());
        System.out.println(collect5); 

    }     
     
}
      
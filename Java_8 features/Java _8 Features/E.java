// How to use Lambda Expression in Java 8       
// Ye h ek Functional Interface in java 
interface  E {
    String getName();   // sirf only one single Abstract method h ye   
    public static void main(String[] args) {
           E e = () ->  "Software Engineer";   // Ye hota h lambda expression in java 8     
           System.out.println(e.getName());           
    }     
    
}       

                  
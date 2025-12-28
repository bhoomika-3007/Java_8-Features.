// Iss Program m hum Predefined Interface Lenge 
// Thread Lambda Expression in java 
// Runnable ek Interface h jiss m bss ek single method h run 
             
class F {
    public static void main(String[] args) {
       Runnable runnable = () -> {
         for(int i =1; i<=10; i++){
            System.out.println("Hello "+i);  
        }
       };    
}        
}   
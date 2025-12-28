// ye bhi functional Interface hi h  kyuki B ke annder bss ek hi   abstract method h 
@FunctionalInterface // iss se hum pata kar sakte h ki ye functional interface h ki nahi    
interface  B1 extends B {
       default void sayMe(){
         // Default kitne bhi aa jaye koi problem nahi h 
         // or static bhi kitne bhi aa jaye jab bhi koi problem nahi h   
       }
}

// Deafult Methods in Interface in java 8 
// Jin methods ki body hoti h ve default methods hote h 
// or jin methods ki body nahi hoti h ve abstract method hote h  
interface  C {
    default void sayMe(){
        System.out.println("This is the Default Method in java ");
    }

    
}
class Test implements C {
      public static void main(String[] args) {
        Test t = new Test();
        t.sayMe();   
    }                 
}

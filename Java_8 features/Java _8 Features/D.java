// static Method in Interface in Java 8  
  
interface  D {
    static void sayBye(){
        System.out.println("This method say that Byee ");
    }
// Iss interface ke ander hum default method bhi bana sakte h 
  default void sayMe(){
    System.out.println("This is default method in java ");
}
       
}     
class Hello implements  D{
    public static void main(String[] args) {
      D.sayBye();  // static mehtod ko hum ase hi call kar sakte h  
      Hello h = new Hello();
      h.sayMe(); // ase hhum default method ko call kara sakte h   
    }

}
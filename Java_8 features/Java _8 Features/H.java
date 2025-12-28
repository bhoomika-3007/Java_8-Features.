// Difference Between Lambda Expression and Anonymous inner class in java 8 
// agar ek se jada abstract method h tho hum use karnge anonymous class ka 

interface  H {
      String getSalary();
      String getDesignation(); 
}
class Main{
public static void main(String[] args) {
    H h = new H(){
        public String getSalary(){
          return "1000";
        }

        public String getDesignation(){
            return "Software Engineer";
        }
    };
    System.out.println(h.getSalary());  
}
}




package playingwithemployees;

public interface Driving {
    
    public final static int speed = 12; 
    
    void drive();
    
    public default void slowdown() {
        System.out.println("Slowing down.");
    };
    
     public default void speedup() {
        System.out.println("Speeding up.");
    };
     
     public static int getSpeed() {
         return speed;
     }
    
}

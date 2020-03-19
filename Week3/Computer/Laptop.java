
package abcomputer;


public class Laptop extends Computer {

    private boolean hasWifi;
    
    public Laptop(int price) {
        super(price);
        hasWifi = false;
    }
    
     public Laptop(String brand, int price, boolean hasWifi) {
        super(brand, price);
        this.hasWifi = hasWifi;
        setPrice(price);
        
    }

    public boolean getHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
    
    @Override
     public void setPrice(int price) {
         if (hasWifi == true) {
             this.price = price + 20;
         } 
         
     }
    
    
    
}

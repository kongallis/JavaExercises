
package abcomputer;


public class Tablet extends Computer {

private boolean hasBluetooth;

    
    public Tablet(int price) {
        super(price);
        hasBluetooth = false;
    }
    
     public Tablet(String brand, int price, boolean hasBluetooth) {
        super(brand, price);
        this.hasBluetooth = hasBluetooth;
        setPrice(price);
        
    }

    public boolean getHasWifi() {
        return hasBluetooth;
    }

    public void setHasWifi(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }
    
    @Override
     public void setPrice(int price) {
         if (hasBluetooth == true) {
             this.price = price + 50;
         } 
         
     }
    
}

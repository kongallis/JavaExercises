
package abcomputer;


public class Desktop extends Computer {
    
    
   private boolean hasExtraLight;
  

    
    public Desktop(int price) {
        super(price);
        hasExtraLight = false;
    }
    
     public Desktop(String brand, int price, boolean hasExtraLight) {
        super(brand, price);
        this.hasExtraLight = hasExtraLight;
        setPrice(price);
        
    }

    public boolean getHasWifi() {
        return hasExtraLight;
    }

    public void setHasWifi(boolean hasExtraLight) {
        this.hasExtraLight = hasExtraLight;
    }
    
    @Override
     public void setPrice(int price) {
         if (hasExtraLight == true) {
             this.price = price + 10;
         } 
         
     }
    
}

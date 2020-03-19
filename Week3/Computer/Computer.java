package abcomputer;

public abstract class Computer {

    private String brand;
    protected int price;
    private static int ComputersCreated;
    
    public Computer(int price) {
        this.price = price;
        this.brand = "Unknown";
        ComputersCreated++;
    }
    
    public Computer(String brand, int price) {
        this.brand = brand;
        this.price = price;
        ComputersCreated++;
        
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public abstract void setPrice(int price);

    public static int getComputersCreated() {
        return ComputersCreated;
    }
    
    
}

    
    


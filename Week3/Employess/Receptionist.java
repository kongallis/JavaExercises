
package playingwithemployees;


public class Receptionist extends Employee implements Driving{

    public Receptionist(String name, double salary) {
        super(name, salary);
    }
    
    
    public void greet() {
        System.out.println(getName() + " Receptionist is greeting.");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " Receptionist is driving");
    }

    @Override
    public void work() {
        greet();
    }
    
}

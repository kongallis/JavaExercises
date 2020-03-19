
package playingwithemployees;


public class Director extends Employee implements Driving, Advisable {

    public Director(String name, double salary) {
        super(name, salary);
    }
    
    
    public void guide() {
        System.out.println(getName() + " Dirctor is guiding.");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " Director is driving.");
    }

    @Override
    public void giveAdvice() {
        System.out.println(getName() + " Director is giving advice.");
    }

    @Override
    public void work() {
        guide();
    }
    
}

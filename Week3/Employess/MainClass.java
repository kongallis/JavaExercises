
package playingwithemployees;

import java.util.ArrayList;
import java.util.List;


public class MainClass {

  
    public static void main(String[] args) {
        
        
        Employee teacher1 = new Teacher("Nick", 1000);
        Employee teacher2 = new Teacher("Mary", 800);
        Employee receptionist = new Receptionist("Peter", 1200);
        Employee director1 = new Director("Andy", 2000);
        Employee director2 = new Director("Jonathan", 2500);
        
        List<Employee> employees = new ArrayList();
        employees.add(teacher1);
        employees.add(teacher2);
        employees.add(receptionist);
        employees.add(director1);
        employees.add(director2);
        
        
        for (Employee emp: employees) {
            emp.work();
        }
        
        List<Advisable> advisers = new ArrayList();
        List <Driving> drivers = new ArrayList();
        
        
        // Count for advisabe and driver employees
        int advisableNum = 0;
        int driversNum = 0;
        
        for (Employee emp: employees) {
            if (emp instanceof Advisable) {
            advisableNum ++;
        }
            if (emp instanceof Driving) {
            driversNum ++;
        } 
            
        }
      
        System.out.println(advisableNum + " is the number of Advisable!");
        System.out.println(driversNum + " is the number of Drivers!");
        
        Director director3 = new Director("Panagiotis", 3000);
        director3.speedup();
        
        
    }
    
}

/*
##Exercise2
1. Create class Employee with name and salary.
2. Create subclasses Teacher, Receptionist, Director
3. Teacher teach(), Receptionist greet(), Director guide()
4. Interfaces Advisable, Driving
5. Advisable has method giveAdvice(), Driving has method drive().
6. Teacher-->Advisable, Receptionist-->Driving, Director-->both.
7. Create 2 Teachers, 1 Receptionist, 2 Director. Put them in a list.
7a. Add abstract method work() in Employee.
7b. Each work() method will call the special method each Subclass has.
7c. Ask each employee to work().
8. Separate those that can drive from those that can advice.
*/

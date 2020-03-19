package abcomputer;

import java.util.ArrayList;
import java.util.List;

public class AbComputer {

    public static void main(String[] args) {

        String sony = "Sony";
        String acer = "Acer";
        String asus = "Asus";
        String lenovo = "Lenovo";

        Computer desktop1 = new Desktop(sony, 100, true);
        Computer laptop1 = new Laptop(700);
        Computer tablet1 = new Tablet(asus, 50, false);

        Computer desktop2 = new Desktop(sony, 800, false);
        Computer laptop2 = new Laptop(acer, 1100, false);
        Computer tablet2 = new Tablet(90);

        Computer desktop3 = new Desktop(750);
        Computer laptop3 = new Laptop(acer, 400, false);
        Computer tablet3 = new Tablet(asus, 100, false);
        Computer tablet4 = new Tablet(lenovo, 120, false);

        List<Computer> comps = new ArrayList();
        comps.add(desktop1);
        comps.add(desktop2);
        comps.add(desktop3);
        comps.add(laptop1);
        comps.add(laptop2);
        comps.add(laptop3);
        comps.add(tablet1);
        comps.add(tablet2);
        comps.add(tablet3);
        comps.add(tablet4);

        int sumSony = 0;
        int sumAcer = 0;
        int sumAsus = 0;
        int sumLenovo = 0;
        int sumUnknown = 0;
        int sumTotal = 0;

        for (Computer computer : comps) {
            System.out.println(computer.getBrand());
            if ((computer.getBrand()).equals(sony)) {
                sumSony += computer.getPrice();
            } else if ((computer.getBrand()).equals(acer)) {
                sumAcer += computer.getPrice();
            } else if ((computer.getBrand()).equals(asus)) {
                sumAsus += computer.getPrice();
            } else if ((computer.getBrand()).equals(lenovo)) {
                sumLenovo += computer.getPrice();
            } else {
                sumUnknown += computer.getPrice();
            }
        }

        sumTotal += sumSony + sumAcer + sumAsus + sumLenovo + sumUnknown;

        System.out.printf("%s Computers costs %d dollars\n", sony, sumSony);
        System.out.printf("%s Computers costs %d dollars\n", acer, sumAcer);
        System.out.printf("%s Computers costs %d dollars\n", asus, sumAsus);
        System.out.printf("%s Computers costs %d dollars\n", lenovo, sumLenovo);
        System.out.printf("%sComputers costs %d dollars\n", "Unknown", sumSony);
        System.out.printf("%s price of all Computers is %d dollars\n", "Total", sumTotal);

        int sumLaptop = 0;
        int sumDesktop = 0;
        int sumTablet = 0;

        for (Computer c : comps) {
            if (c instanceof Desktop) {
                sumDesktop += c.getPrice();
            } else if (c instanceof Laptop) {
                sumLaptop += c.getPrice();
            } else if (c instanceof Tablet) {
                sumTablet += c.getPrice();
            }
        }

        
        
    }
}

/*
##Example
1. Create abstract class Computer ("brand", "price", "getPrice()", "getBrand()", "setBrand()").
Only "setPrice()" will be abstract. Subclasses Laptop, Desktop, Tablet.
2. You can only specify "price", "brand" while creating the object(use appropriate Constructors).
No class will have a default constructor.
All classes will have 2 constructors. One with "price" and one with "price-brand".
3. Make 10 objects and store to list.
4. Get the sum of prices according to "brand". Print sum of each brand and print total.
5.Modify the program so that user(main method) cannot change the brand of the computer.
6.Get the sum of prices according to "object type".
 */

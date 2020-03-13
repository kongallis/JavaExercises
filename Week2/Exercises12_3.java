package mypackage;


import java.util.Scanner;

public class Exercises12_3 {
    
    

    public static void main(String[] args) {

        /*
        Write a Java program to print the area and perimeter of a circle. 
        Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586 
            Use memory-friendly variables and print the result with printf.
         */
        exercise1();
        
        
        /*
        Write a Java program to print the result of the following operations for x = 1 and y =2. 
        After every operation print the result of the whole operation, x and y.
        a. -x + x++ * 2
        b. (x++ + --y) + --y
        c. x + x
        At the end, after all the operations print the values of x and y.   
        */
        exercise2();
        
        
        /*
        Write a Java program to print the area and perimeter of a rectangle. 
        Test Data:
        Width = 5.5 Height = 8.5
        Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20    
        */
        exercise3();
        
        // Write a Java program to convert seconds to hour, minute and seconds.
        exercise4();
        
        /*
        Write a program to enter names and year of birth of 3 people. 
        Print a message for each person showing his/her details.
        */
        exercise5();
        
        //Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        exercise6();
        
        /*
        Write a Java program that reads a number in inches, converts it to meters.
        Note: One inch is 0.0254 meter.
        */
        exercise7();
        
        /*
        Γράψτε ένα πρόγραμμα που δέχεται την τιμή ενός προϊόντος 
        και εμφανίζει σε μηνύματα τη τιμή του σε έκπτωση 10%, 20%, 30%, 40%, 50%, 60%.
        */
        exercise8();
    }
    static void exercise1() {
        
        float radius = 7.5f;
       
        double perimeterCirle = 2 * Math.PI * radius;
        System.out.println("The perimeter of the circle is " + perimeterCirle);
        System.out.printf("Formated perimeter: %f %n", perimeterCirle);

         
        double areaCircle = (Math.PI * radius * radius);
        System.out.println("The area of the circle is: " + areaCircle); 
        System.out.printf("Formated area: %f %n", areaCircle);
       
    }
    
    static void exercise2() {
        byte x = 1;
        byte y = 2;      
        
        System.out.println("********EXERCISE 2 **********");
        System.out.println("a. -x + x++ * 2, equals " + ( -x + x++ * 2)); // (x = 2)
        System.out.println("b. (x++ + --y) + --y, equals " + ((x++ + --y) + --y)); // (x = 3, y = 0) 
        System.out.println("c. x + x, equals " + (x + x)); // (x =3, y = 0)
        
        System.out.println(x);
        System.out.println(y);
        
    }
    
    static void exercise3() {
        float width = 5.5f;
        float height = 8.5f;
        
        float rectangleArea = width * height;
        System.out.println("The rectanglea area is " + rectangleArea);
        
        float rectanglePerimeter = 2 * (width + height);
        System.out.println("The rectangele perimeter is " + rectanglePerimeter);
    }
    
    static void exercise4() {
        int secondsGiven = 7852; // e.g. 2 hours, 10 minutes, 52 seconds (=7852 seconds)
        
        
        
        int hours = secondsGiven / 3600;
        int minutes = (secondsGiven % 3600) / 60;
        int seconds = (secondsGiven % 3600) % 60;
        
        System.out.println("HOURS: " + hours);
        System.out.println("MINUTES: " + minutes);
        System.out.println("SECONDS: " + seconds);
    }
    
    static void exercise5() {
        Scanner sc = new Scanner(System.in);
        String [] names = new String[3];
        Short [] birthYears = new Short[3];
        
        for (int i = 1; i <= 3; i++) {
        
        System.out.println("Please give name " + i);
        names[i-1] = sc.next();
        
        System.out.println("Please give birthyear of " + names[i-1]);
        birthYears[i-1] = sc.nextShort();
        
        
        
    }
        for (int i = 1; i <= names.length; i++) {
          System.out.println("The birthyear of " + names[i-1] + " is " + birthYears[i-1]);  
        }
        
        
    }
    
    static void exercise6() {
        float fahrenheit = -50f;
        float celsius;
        
        celsius = (float)((fahrenheit - 32) / 1.8);
        
        System.out.println("CELSIUS ==> " + celsius);
    }
    
    static void exercise7() {
       double inches;
       double meters = 21.2;
       
       inches = meters * (0.0254);

        System.out.println(meters + " meters are equal to " + inches + " inches");
    }
    
    static void exercise8() {
        System.out.println("Please tell me the price");
        Scanner input = new Scanner(System.in);
        short price = input.nextShort();
        
        double discount10 = price * 0.1;
        double discount20 = price * 0.2;
        double discount30 = price * 0.3;
        double discount40 = price * 0.4;
        double discount50 = price * 0.5;
        double discount60 = price * 0.6;
        
        System.out.println("The product with 10% discount costs " + discount10);
        System.out.println("The product with 20% discount costs " + discount20);
        System.out.println("The product with 30% discount costs " + discount30);
        System.out.println("The product with 40% discount costs " + discount40);
        System.out.println("The product with 50% discount costs " + discount50);
        System.out.println("The product with 60% discount costs " + discount60);
        
        
        
    }
}


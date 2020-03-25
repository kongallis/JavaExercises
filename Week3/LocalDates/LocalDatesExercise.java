package localdatesexercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LocalDatesExercise {

    /*

Create a class BootCamp.
This class has 3 variables
name: String
startingDate: LocalDate
endingDate: LocalDate
The program should ask the user to create three Bootcamps.
Ask for name, startingDate and endingDate for each one from the user (keyboard).
Store these Bootcamps in a list.
Then ask the user to enter a date. Check if a bootcamp will be available in that date and inform the user accordingly.
For example, if the user enters 10/10/2020 and a bootcamp is available, then the program should print a message:
Bootcamp SQL will be available in 10 Oct 2020. It starts 01 Oct 2020 and ends 30 Nov 2020.
Otherwise, the message will be: Sorry no bootcamp available in X date.
***Catch any exceptions that might occur. Accepts only Dates in the format dd/MM/yyyy.
***Try to use methods.
     */
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            BootCamp bootcamp = new BootCamp();
            BootCamp.listOfBootcamps.add(bootcamp);
        }
        LocalDate dateAsking;
        
        checkAvailableBootCamp();
    }


    static void checkAvailableBootCamp() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a date in format dd/MM/yyyy.");
        String dateInString = input.next();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date;
        try {
             date = LocalDate.parse(dateInString, format);
                     int askMonth = date.getMonthValue();
        int askYear = date.getYear();
        int askDay = date.getDayOfMonth();
        for (BootCamp bootcamp : BootCamp.listOfBootcamps) {
            int bootCampMonth = bootcamp.getStartingDate().getMonthValue();
            int bootCampYear = bootcamp.getStartingDate().getYear();
            if (askYear == bootCampYear && askMonth == bootCampMonth) {
                System.out.println("Bootcamp SQL will be availabe in " 
                + askDay + " " + (date.getMonth()) + " " + askYear);
            } else {
                System.out.println("Sorry not bootcamp available in " 
                + askDay + " " + (date.getMonth()) + " " + askYear);
            }
        }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Invalid date format.");
        }      
    }
   

}

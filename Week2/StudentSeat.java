package studentseat;

import java.util.Scanner;
import java.util.Random;

public class StudentSeat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many rows does the class have?");
        int rows = input.nextInt();

        System.out.println("How many students does the class have?");
        int students = input.nextInt();

        boolean equalRows = (students % rows == 0);
        int maxRowSeats = students / rows;

        if (equalRows) {
            System.out.println("Each row has " + maxRowSeats + " seats");
        } else {
            System.out.println("The first " + (rows - 1) + " rows have " + maxRowSeats + " seats each");
            System.out.println("The last row has " + (students % rows) + " seat(s)");
        }

        
        // Intialization of the 2d array
        String[][] classStructure = new String[rows][];
        if (equalRows) {
            for (int i = 1; i <= classStructure.length; i++) {
                    classStructure[i - 1] = new String[maxRowSeats];
                }
            
        } else {
            

            // Creating for each row a substring
            for (int i = 1; i <= classStructure.length; i++) {
                if (i == classStructure.length) {
                    classStructure[i - 1] = new String[students % rows];
                } else {
                    classStructure[i - 1] = new String[maxRowSeats];
                }
            }

        }

        // We start with all the seats empty
        int seatsFilled = 0;
        int emptySeats = students;

        Random random = new Random();
        int randomColumnSeat;
        int randomRowSeat;
        int randomSeat = 0;

        while (seatsFilled < students) {
            
            // The random seat has to be between 1 and the number of students
            while (true) {
                randomSeat = random.nextInt(students);
                if (randomSeat != 0) {
                    break;
                }
            }
            
            // Finding the column and row of student
            randomColumnSeat = randomSeat % rows ;
            randomRowSeat = randomSeat / rows;
            String RandomStudent = classStructure[randomRowSeat-1][randomColumnSeat-1];
            
            if ( RandomStudent == null) {
               System.out.println(emptySeats + " seats are empty!");
            System.out.println("Please enter student's name for seat [" + (randomRowSeat-1) + "][" + (randomColumnSeat-1) + "]");
            classStructure[randomRowSeat-1][randomColumnSeat-1] = input.next(); 
            
            emptySeats --;
            seatsFilled ++;
            }
            

        }

        System.out.println("Thank you!");

        // Prints the structure of the class.
        for (int i = 0; i < classStructure.length; i++) {
            for (int j = 0; j < classStructure[i].length; j++) {
                System.out.print(classStructure[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

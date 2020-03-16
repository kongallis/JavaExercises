package exercisesreadwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercisesReadWrite {

    public static void main(String[] args) throws IOException {

        // Store these details in a file
        String filePath = "/Users/macuser/Documents/ReaderWriter/myTextFile.txt";

        // Calls method to write a file.
        writeToFile(filePath);
        
        
        
        // Call method to print the output 
        printFileOutput(filePath);
        
      
        
        
    }

    // Writing to a file, method.
    static void writeToFile(String nameOfFile) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter info about your family");
        File fileToWrite = new File(nameOfFile);
        FileWriter fileWriter = new FileWriter(fileToWrite, true);
        PrintWriter writer = new PrintWriter(fileToWrite);

        writer.println("NAME\t AGE\t HEIGHT(m)\t WEIGHT(kg)");

        String name;
        int age;
        float height;
        int weight;
        String fs;

        while (true) {
            System.out.println("Please type exit for ending this, otherwise proceed");

            System.out.println("What's his/her name?");
            name = input.next();
            if (name.equals("exit")) {
                break;
            }

            System.out.println("What's his/her age?");
            age = input.nextInt();

            System.out.println("What's his/her height in meters?");
            height = input.nextFloat();

            System.out.println("What's his/her weight in kilograms?");
            weight = input.nextInt();

            fs = String.format("%s\t %d\t %.2f\t %d", name, age, height, weight);
            writer.println(fs); //Θα βάζει μέσα το formatted String
            System.out.println("Personally was successfully created ! ! !");

        }

        input.close();
        writer.close();

    }
    
    // Print the output, method.
   static void printFileOutput (String nameOfFile) throws FileNotFoundException {
         File file = new File(nameOfFile); 
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        System.out.println(line);
        
        while (sc.hasNextLine()) {
            
            line = sc.nextLine();
            System.out.println(line);
            
        }
        sc.close();
   }

}

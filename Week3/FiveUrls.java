package fiveurls;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FiveUrls {

    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "/Users/macuser/Documents/ReaderWriter/urlFile.txt";

        subdomain(filePath);

        urlJava(filePath);
    }

    /*
Exercise 2

Create a .txt file that contains the following 5 URLs.
https://www.javatpoint.com/
https://docs.oracle.com/javase/8/docs/
https://www.baeldung.com/
https://www.vogella.com//tutorials/java.html
https://www.tutorialspoint.com/java_technology_tutorials.htm
Create a method for the following:
Read the file and print only the subdomain of each url.
For example the subdomain of https://www.javatpoint.com/ is javatpoint.
The subdomain of https://docs.oracle.com/javase/8/docs/ is docs.oracle
Also create a method that prints only the urls that contain the word java.
     */
    static void subdomain(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println("URL: " + line);
           
            
            int cutIndexStart = line.indexOf("www.") + 4; //4 is for each character of "www."
            if (cutIndexStart == 3) {
                cutIndexStart = line.indexOf("//") + 2;
            }
            int cutIndexEnd = line.indexOf(".com");

            System.out.println("The domain is: " + line.substring(cutIndexStart, cutIndexEnd));
            

        }
        sc.close();
        

        

    }

    static void urlJava(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        
        boolean containsJava;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            containsJava = line.contains("java");
            if (containsJava) {
                System.out.println("URL contains java: " + line);
            }
            
        }
        sc.close();
    }

}

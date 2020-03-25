package localdatesexercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BootCamp {

    private String name;
    private LocalDate startingDate;
    private LocalDate endingDate;
    public static List<BootCamp> listOfBootcamps = new ArrayList();

    public BootCamp() {
        createBootCamp();
        
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }
    
    
    
    public void createBootCamp() {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Please give me name");
        this.name = input.next();
        System.out.println("Please give a starting date in format dd/MM/yyyy.");
        String start = input.next();
        this.startingDate = LocalDate.parse(start, format);
        System.out.println("Please give an ending date in format dd/MM/yyyy.");
        String end = input.next();
        this.endingDate = LocalDate.parse(end, format);
        
}
    
}



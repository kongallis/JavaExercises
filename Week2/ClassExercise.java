package classexercise;

import java.util.Arrays;
import java.util.Scanner;

public class ClassExercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi, what's your name?");
        String name = input.next();

        System.out.println("What's your gender?");
        String gender = input.next();

        System.out.println("What's your age?");
        int age = input.nextInt();

        ageMessage(age);
        ageMessage2(age);

        int season = favoriteSeason();

        respondSeason(season);

        returnBMI();

        String luckyDay = luckyDays(age);

        clubEntrance(age, gender, name, luckyDay);

    }

    static void ageMessage(int age) {

        if (age <= 5) {
            System.out.println("You are too young for this app.");
            System.out.println("Come back in " + (6 - age) + " year(s) when you will be a student.");
        } else if (age <= 18) {
            System.out.println("Oh you are a student.");
            System.out.println("Come back in " + (18 - age) + " more year(s) left and afterwards you will make money.");
        } else if (age <= 40) {
            System.out.println("Weel. you must be employed.");
            System.out.println("You finished school " + (age - 18) + " years ago.");
        } else {
            System.out.println("You are too old for this app");
        }

    }

    static void ageMessage2(int age) {
        if (age >= 40) {
            System.out.println("You were " + (age - 40) + " years old in 1980.");
        } else {
            System.out.println("You were born after 1980");
        }
        System.out.println("You will be " + (age + 20) + " years old in 2020.");
    }

    static int favoriteSeason() {
        Scanner input = new Scanner(System.in);
        String[] seasons = {"1. Winter", "2. Spring", "3. Summer", "4. Autumn"};
        System.out.println("What is your favorite season?");
        System.out.println(Arrays.toString(seasons));

        int season = input.nextInt();
        return season;
    }

    static void respondSeason(int season) {
        if (season == 1) {
            System.out.println("It must be cold outside.");
        } else if (season == 2) {
            System.out.println("Ohh, flowers are very beautiful these days.");
        } else if (season == 3) {
            System.out.println("Let's go for swimming.");
        } else {
            System.out.println("The trees are full of brown leaves.");
        }
    }

    static void returnBMI() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your height in meters?");
        double height = input.nextDouble();

        System.out.println("What's your weight?");
        int weight = input.nextInt();

        double BMI = weight / (height * height);

        if (BMI < 18.5) {
            System.out.println("You are underweight.");
        } else if (BMI < 25) {
            System.out.println("Normal weight.");
        } else if (BMI < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity.");
        }

    }

    static String luckyDays(int age) {
        int dayIndex = 0;
        int days = age * 365;

        String luckyDay = "";

        int n1 = days / 100000 % 10;
        int n2 = days / 10000 % 10;
        int n3 = days / 1000 % 10;
        int n4 = days / 100 % 10;
        int n5 = days / 10 % 10;
        int n6 = days % 10;

        dayIndex = n1 + n2 + n3 + n4 + n5 + n6;

        if (dayIndex > 6) {
            dayIndex = dayIndex % 7;
        }

        if (dayIndex == 0) {
            luckyDay = "Monday";
        } else if (dayIndex == 1) {
            luckyDay = "Tuesday";
        } else if (dayIndex == 2) {
            luckyDay = "Wednesday";
        } else if (dayIndex == 3) {
            luckyDay = "Thursday";
        } else if (dayIndex == 4) {
            luckyDay = "Friday";
        } else if (dayIndex == 5) {
            luckyDay = "Saturday";
        } else {
            luckyDay = "Sunday";
        }

        System.out.println("You lucky day is " + luckyDay + " !!!");
        return luckyDay;

    }

    static void clubEntrance(int age, String gender, String name, String luckyDay) {
        Scanner input = new Scanner(System.in);

        if (gender.equals("M")) { //MALE case

            if (luckyDay == "Wednesday") {
                if (age <= 40 && age >= 20) {
                    if (age <= 25) {
                        System.out.println("You can enter the club " + name);
                    } else {
                        System.out.println("You can enter the club Mr. " + name);
                    }
                }
            }

        } else { //FEMALE case 
            System.out.println("Are you married?");
            String married = input.next();

            if (married.equals("Yes")) { // ANSWER must be "Yes" or "No"
                System.out.println("You can enter the club Mrs. " + name);
            } else {
                System.out.println("You can enter the club Ms. " + name);
            }

        }

    }
}

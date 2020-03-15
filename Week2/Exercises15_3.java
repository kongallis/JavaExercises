import java.util.Scanner;

class Exercises15_3 {

    public static void main(String[] args) {

        whichSchool();
        toDoEveryDay();
        whatSeason(args[0]);
        numberOfMonthDays();
        testGrade();
        canDoAge();
        planetWeight();
        childOrAdult();
        bestFriends();

    }

    /*
       1.What class in school are you going according to age;
       Use an if-else-if.
       For example: 5-12 dimotiko, ...
       Can you use a switch statement?
     */
    static void whichSchool() {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();


        if (age < 6 || age > 18) {
            System.out.println("Δεν πάει σχολείο");
        } else if (age <= 12) {
            System.out.println("Δημοτικό");
        } else if (age <= 15) {
            System.out.println("Γυμνάσιο");
        } else {
            System.out.println("Λύκειο");
        }

        switch (age) {
            case 7:
                System.out.println("Πρώτη δημοτικού");
                break;

            case 8:
                System.out.println("Δευτέρα δημοτικού");
                break;

            case 9:
                System.out.println("Τρίτη δημοτικού");
                break;

            case 10:
                System.out.println("Τετάρτη δημοτικού");
                break;

            case 11:
                System.out.println("Πέμπτη δημοτικού");
                break;

            case 12:
                System.out.println("Έκτη δημοτικού");
                break;

            case 13:
                System.out.println("Πρώτη γυμνασίου");
                break;

            case 14:
                System.out.println("Δευτέρα γυμνασίου");
                break;

            case 15:
                System.out.println("Τρίτη γυμνασίου");
                break;

            case 16:
                System.out.println("Πρώτη λυκείου");
                break;

            case 17:
                System.out.println("Δευτέρα λυκείου");
                break;

            case 18:
                System.out.println("Τρίτη λυκείου");
                break;

            default:
                System.out.println("Δεν πάει σχολείο ");

        }
    }


    // 2. What to do every day (switch). Monday-Friday: go to work. Sat-Sun: relaxing
    static void toDoEveryDay() {
        Scanner input = new Scanner(System.in);
        String day = input.next();


        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            System.out.println("Go to work.");
        } else {
            System.out.println("Relaxing...");
        }

    }


    // 3. What season is according to month. Enter month from terminal.
    static void whatSeason(String month) {

        if (month.equals("December") || month.equals("January") || month.equals("February")) {
            System.out.println("It's WINTER!");
        } else if (month.equals("March") || month.equals("April") || month.equals("May")) {
            System.out.println("It's SPRING!");
        } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
            System.out.println("It's SUMMER!");
        } else {
            System.out.println("It's AUTUMN!");
        }
    }

    // 4. Print the number of days each month has. Use switch.
    static void numberOfMonthDays() {
        Scanner input = new Scanner(System.in);
        String month = input.next();

        if (month.equals("January") || month.equals("March") || month.equals("May") || month.equals("July") || month.equals("October") || month.equals("December")) {
            System.out.println(month + " has 31 days.");
        } else if (month.equals("April") || month.equals("June") || month.equals("September") || month.equals("November")) {
            System.out.println(month + " has 30 days.");
        } else {
            System.out.println(month + " has 28 in a common year and 29 in leap years");
        }
    }

    // 5. Get message ("Perfect, Good, Pass, Fail") based on grade (A, B, C-D, the rest).
    static void testGrade() {
        Scanner input = new Scanner(System.in);
        String grade = input.next();

        switch (grade) {
            case "A":
                System.out.println("Perfect");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Pass");
                break;
            case "D":
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
        }
    }

    /*
    6. Based on age what can you do?
    lt 16>>You cannot drive
    16-17>>You can drive but not vote
    18-21>>You can vote but not drink
    gt 22>>You can do anything
     */
    static void canDoAge() {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age >= 22) {
            System.out.println("You can do anything");
        } else if (age >= 18) {
            System.out.println("You can vote but not drink");
        } else if (age >= 16) {
            System.out.println("You can drive but not vote");
        } else {
            System.out.println("You cannot drive");
        }
    }


    /*
    7. Program should ask your weight and planet. Compute your weight on the planet based on the table below:
#    Planet    Relative gravity
1    Venus        0.78
2    Mars        0.39
3    Jupiter    2.65
4    Saturn    1.17
5    Uranus    1.05
6    Neptune    1.23
So, for example, if your weight is 80 kg on earth,
then you would weigh just over 31 kg on Mars,
since Mars' gravity is 0.39 times earth's gravity.
(80 * 0.39 is 31.20)
     */
    static void planetWeight() {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your weight on Earth?");
        double weight = input.nextDouble();

        System.out.println("In which planet do you live?");
        String planet = input.next();

        switch (planet) {
            case "Venus":
                System.out.println("Your weight on planet " + planet + " is " + (0.78 * weight));
                break;
            case "Mars":
                System.out.println("Your weight on planet " + planet + " is " + (0.39 * weight));
                break;
            case "Jupiter":
                System.out.println("Your weight on planet " + planet + " is " + (2.65 * weight));
                break;
            case "Saturn":
                System.out.println("Your weight on planet " + planet + " is " + (1.17 * weight));
                break;
            case "Uranus":
                System.out.println("Your weight on planet " + planet + " is " + (1.05 * weight));
                break;
            case "Neptune":
                System.out.println("Your weight on planet " + planet + " is " + (1.23 * weight));
                break;
        }

    }


    // 8. Use ternary to return a message child or adult. Older than 18 is adult.
    static void childOrAdult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = sc.nextInt();

        String message = (age > 18) ? "adult" : "child";
        System.out.println(message);
    }


    /*
    9. Create a program that stores the names of your 4 best friends in an array.
    Then print these names from the array. Use for-traditional, for enhanced, while, do-while.
     */
    static void bestFriends() {
        Scanner input = new Scanner(System.in);
        String[] friends = new String[4];
        for (int i = 0; i < friends.length; i++) {
            friends[i] = input.next();
            System.out.print(friends[i] + " ");
        }
        System.out.println();


        for (String number : friends) {
            System.out.print(number + " ");
        }
        System.out.println();


        int i = 0;
        while (i < friends.length) {
            System.out.print(friends[i] + " ");
            i++;
        }
        System.out.println();

        int j = 0;
        do {
            System.out.print(friends[j] + " ");
            j++;
        } while (j < friends.length);
        System.out.println();


    }



}





package PYQ2016U;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Specify your day in number: ");
        System.out.println("1 for Monday");
        System.out.println("2 for Tuesday");
        System.out.println("3 for Wednesday");
        System.out.println("4 for Thursday");
        System.out.println("5 for Friday");
        System.out.println("6 for Saturday");
        System.out.println("7 for Sunday");

        int dayInt = sc.nextInt();
        
        System.out.println("The name of the day is : " + getDays(dayInt));

        System.out.println("The following day of " + getDays(dayInt) + " is : " + getDays(dayInt + 1));
        
        System.out.println("The previous day of " + getDays(dayInt) + " is : " + getDays(dayInt - 1));

        System.out.println("How many days to add to the specified/current day (" + getDays(dayInt) + ")? :");
        int newDayInt = sc.nextInt();

        System.out.println("The new day after the addition of " + newDayInt + " day(s) is : " + getDays(dayInt + newDayInt));

        sc.close();
    }

    public static String getDays(int dayInt) {
        
        if (dayInt <= 0) {
            dayInt += 7;
        }

        while (dayInt > 7) {
            dayInt -= 7;
        }

        switch (dayInt) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default: 
                return "Invalid Day";
        }
    }
}

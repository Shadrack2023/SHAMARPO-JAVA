/*(Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week. Here is a sample run: */


import java.util.Scanner;

public class futuredate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter today's day of the week
        System.out.print("Enter today's day (Sunday is 1, Monday is 2, ..., Saturday is 7): ");
        int today = input.nextInt();
        
        // Prompt the user to enter the number of days in the future
        System.out.print("Enter the number of days after today: ");
        int daysAfter = input.nextInt();
        
        // Calculate the future day of the week
        int futureDay = (today + daysAfter) % 7;
        
        // Determine the day of the week as a string
        String todayString = getDayOfWeek(today);
        String futureDayString = getDayOfWeek(futureDay);
        
        // Display the result
        System.out.println("Today is " + todayString + " and the future day is " + futureDayString);
        
        input.close();
    }
    
    // Method to convert day number to day name
    public static String getDayOfWeek(int day) {
        switch (day) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default: return "Invalid day";
        }
    }
}

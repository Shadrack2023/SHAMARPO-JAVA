/*(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
Pattern APattern B** * * * * *
Pattern C
*
Pattern D
* * * * * *
* ** * * * ** ** * * * *
* * ** * * ** * ** * * *
* * * ** * ** * * ** * *
* * * * ** ** * * * ** *
* * * * * *** * * * * ** */

public class pattern {
    public static void main(String[] args) {
        // Pattern D
        System.out.println("Pattern D:");
        for (int i = 1; i <= 5; i++) { // Loop for rows
            for (int j = 1; j <= 5; j++) { // Loop for columns
                if (j == i || j == 6 - i) { // Print star at the required positions
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space for non-star positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

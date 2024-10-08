public class pyramidpatt {
    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pyramid
        //int maxPower = 7; // The highest power of 3 to print
        
        // Loop for each level of the pyramid
        for (int i = 0; i < rows; i++) {
            // Loop to print powers of 3
            for (int j = 0; j <= i; j++) {
                System.out.print((int)Math.pow(3, j) + " "); // Calculate and print 3^j
            }
            System.out.println(); // Move to the next line after each row
        }
        
        // Print the inverted pyramid pattern
        for (int i = 0; i < rows; i++) {
            // Loop to print powers of 3 in reverse
            for (int j = rows - 1; j > i; j--) {
                System.out.print((int)Math.pow(3, j) + " "); // Calculate and print 3^j
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}

/*(Conversion from square meter to ping) Write a program that displays the following
two tables side by side (note that 1 ping = 3.305 square meters):
Ping
10
15
...
75
80
Square meter
33.050
49.575|
|
|Square meter
30
35Ping
9.077
10.590
247.875
264.400|
|95
10028.744
30.257 */

public class squaretoping {
    public static void main(String[] args) {
        // Print the table headers
        System.out.printf("%-15s%-15s%-15s%-15s%n", "Ping", "Square Meters", "Ping", "Square Meters");
        System.out.println("---------------------------------------------------------");
        
        // Loop through ping values from 10 to 100 in increments of 5
        for (int ping = 10; ping <= 100; ping += 5) {
            // Convert ping to square meters
            double squareMetersFromPing = ping * 3.305;
            // Use the same loop to convert square meters back to ping for values from 30 to 100
            double squareMeters = ping * 3.305;  // same ping value for calculation
            double pingFromSquareMeters = squareMeters / 3.305;
            
            // Print the values in the format
            System.out.printf("%-15d%-15.3f%-15d%-15.3f%n", ping, squareMetersFromPing, ping, pingFromSquareMeters);
        }
    }
}

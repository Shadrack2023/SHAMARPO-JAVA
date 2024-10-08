public class temp {
    public static void main(String[] args) {
        // Print the table header
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("--------------------------");
        
        // Loop through Celsius values from 0 to 100
        for (int celsius = 0; celsius <= 100; celsius += 2) {
            double fahrenheit = celsius * 9.0 / 5.0 + 32;
            // Display the Celsius and corresponding Fahrenheit value formatted to one decimal place
            System.out.printf("%-7d\t\t%.1f%n", celsius, fahrenheit);
        }
    }
}

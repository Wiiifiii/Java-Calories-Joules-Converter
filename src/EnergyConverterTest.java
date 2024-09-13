

public class EnergyConverterTest {
    public static void main(String[] args) {
        // Create an instance of the EnergyConverter class
        EnergyConverter converter = new EnergyConverter();
        boolean running = true;

        // Loop to display the menu and handle conversions
        while (running) {
            int choice = converter.getMenuChoice();

            // Use switch structure to handle user input
            switch (choice) {
                case 1:
                    converter.convertJoulesToCalories(); // Convert Joules to Calories
                    break;
                case 2:
                    converter.convertCaloriesToJoules(); // Convert Calories to Joules
                    break;
                case 3:
                    System.out.println("Exiting the program. Thank you bye!");
                    running = false; // Stop the program
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }
        }
    }
}
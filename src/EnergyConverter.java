import java.util.Scanner;
/* Implement a Java class that converts calories to joules. There should be an implementation to ask user which 
   conversion will be done and when to stop then program (perhaps menu choice, etc). Use fraction 0.2390 to convert 
   joules to calories and 4.184 to convert calories to joules. You must use switch-structure and constant values somehow in your program.
*/
public class EnergyConverter {

// UnitConverters factors for Joules and Calories
    public static final double J_TO_CAL = 0.2390; // constant value
    public static final double CAL_TO_J = 4.184; // constant value

// Method to display the menu and get the user's choice between 1-3// NOTE! string input throw Exception.
    public int getMenuChoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** Convert J to cal Menu ***");
        System.out.println("1. Convert Joules to Calories");
        System.out.println("2. Convert Calories to Joules");
        System.out.println("3. Exit");
        System.out.print("Choose an option (1-3): ");
        int choice = scan.nextInt();
      
        return choice;
    }
    
    // Method to convert joules to calories
    public void convertJoulesToCalories() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter energy in Joules: ");
        double joules = scan.nextDouble();
        double calories = joules * J_TO_CAL;
        System.out.printf("%.2f Joules is equal to %.2f Calories\n", joules, calories);
       
    }
    
    // Method to convert calories to joules
    public void convertCaloriesToJoules() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter energy in Calories: ");
        double calories = scan.nextDouble();
        double joules = calories * CAL_TO_J;
        System.out.printf("%.2f Calories is equal to %.2f Joules\n", calories, joules);
      
}
}

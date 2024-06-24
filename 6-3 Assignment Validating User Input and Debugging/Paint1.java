import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallon = 350.0;
        
        // Implement do-while loops to ensure valid input for wall's height and width
        // Prompt user to input wall's height
        do {
            System.out.println("Enter wall height (feet): ");
            try {
                String input = scnr.nextLine();
                wallHeight = Double.parseDouble(input);
                if (wallHeight <= 0) {
                    throw new Exception("Height must be a positive number.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } while (wallHeight <= 0);

        // Prompt user to input wall's width
        do {
            System.out.println("Enter wall width (feet): ");
            try {
                String input = scnr.nextLine();
                wallWidth = Double.parseDouble(input);
                if (wallWidth <= 0) {
                    throw new Exception("Width must be a positive number.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } while (wallWidth <= 0);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallon;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
    }
}

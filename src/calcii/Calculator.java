package calcii;



	import java.util.Scanner;

	public class Calculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            // Display menu
	            System.out.println("Choose an operation:");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Exponentiation");
	            System.out.println("6. Quit");

	            // Get user choice
	            System.out.print("Enter your choice (1-6): ");
	            int choice = scanner.nextInt();

	            if (choice == 6) {
	                System.out.println("Exiting calculator. Goodbye!");
	                break;
	            }

	            System.out.print("Enter first number: ");
	            double num1 = scanner.nextDouble();
	            System.out.print("Enter second number: ");
	            double num2 = scanner.nextDouble();

	            double result = 0;

	            // Perform operation based on user choice
	            switch (choice) {
	                case 1:
	                    result = num1 + num2;
	                    break;
	                case 2:
	                    result = num1 - num2;
	                    break;
	                case 3:
	                    result = num1 * num2;
	                    break;
	                case 4:
	                    if (num2 != 0) {
	                        result = num1 / num2;
	                    } else {
	                        System.out.println("Error: Cannot divide by zero!");
	                        continue; // Continue the loop
	                    }
	                    break;
	                case 5:
	                    result = Math.pow(num1, num2);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please choose again.");
	                    continue; // Continue the loop
	            }

	            System.out.println("Result: " + result);
	            System.out.println(); // Blank line for readability
	        }

	        scanner.close();
	    }
	}



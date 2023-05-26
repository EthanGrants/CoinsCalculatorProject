import java.util.Scanner;
/** CoinMain.java - Calculator Exceptions 
 * <p>Problem Statement: Create a calculator which performs simple arithmetic functions and throws an exception if an operator
 * is unrecognized or if trying to divide by zero. 
 * </p>
 * 
 * <p>Algorithm: <br />
 * 1. Create main class <br/>
 * 2. Create variables, a boolean, three doubles, and a string <br/> 
 * 3. Tell the user the calculator is on and what the current result is <br/>
 * 4. Then have a while loop that is set to true. ask the user to enter an operator and a number
 *    r to reset, and p to power down. Then get the user's input and put it into a string. <br/>
 * 5. If R or P was entered, reset or power down. Then split the string, make sure the user enters
 *    an operator and number, then have two variables. One for the operator and one for the number. <br/>
 * 6. Have a try and catch to validate the number, print out what the result is. <br/>
 * 7. Then have another try and catch to validate the operator and that it isn't being divided by
 *    zero. Have a case to make sure the operators are +,-,*, or /. <br/>
 * 8. Before the catch, Print full information if it isn't being divided by zero. <br/>
 * 9. Update the currentAmount variable at the end. <br/>
 * 10.Compile and test. <br/>
 * 
 * </p>
 * 
 *   @author Ethan Grant
 *   @version Module 13, Hw 2
 */
public class Calculator
{
    public static void main(String[] args) {
        // variables
        boolean powerOn = true;
        double result = 0.0;
        double currentAmount = 0.0;
        double validNumber = 0.0;
        String input = "";

        System.out.println("Your calculator is now on.");
        System.out.println("The result is currently " + result + "\n");
        // Perform while calculator is on
        while (powerOn) {
            // Get user input
            System.out.println("Enter an operator (+, -, *, or /) and a number, \"R\" to reset, or \"P\" to turn off power");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();

            // Validate reset
            if (input.equalsIgnoreCase("R")) {
                currentAmount = 0.0;
                System.out.println("Resetting to zero.");
                continue;
            }
            // Turn power off
            if (input.equalsIgnoreCase("P")) {
                powerOn = false;
                System.out.println("Goodbye.");
                break;
            }

            // Split input
            String[] inputSplit = input.split(" ");
            // User must enter operator and number
            if (inputSplit.length != 2) {
                System.out.println("Enter an operator and number.");
                continue;
            }
            // Have operator and number
            String operator = inputSplit[0];
            String inputNum = inputSplit[1];

            // Try and catch to validate number
            // Double.parseDouble() converts string to double
            try {
                validNumber = Double.parseDouble(inputNum);
            }
            catch(NumberFormatException e) {
                System.out.println("Not a valid number");
                System.out.println("The result is still " + String.format("%.1f",result));
                continue;
            }

            // Try and catch to perform calculation and prevent zero from being divided and having an unknown operator
            try {
                switch(operator) {
                    case "+":
                        result = currentAmount + validNumber;
                        break;
                    case "-":
                        result = currentAmount - validNumber;
                        break;
                    case "*":
                        result = currentAmount * validNumber;
                        break;
                    case "/":
                        if (validNumber == 0){
                            throw new DivideByZeroException();
                        }
                        else {
                            result = currentAmount / validNumber;
                        }
                        break;
                    default:
                        throw new UnknownOperatorException();
                }
                // If the number isn't 0 then print the full information
                if (validNumber != 0) {
                    Double newAmount = currentAmount - validNumber;
                    System.out.println("The result of " + String.format("%.1f ",currentAmount) + operator + String.format(" %.1f is %.1f. \n",validNumber,result));
                }
            }
            catch(UnknownOperatorException | DivideByZeroException e) {
                System.out.println(e.getMessage());
                System.out.println("The result is still " + String.format("%.1f",result));
            }

            // Update variable
            currentAmount = result;
        }
    }
}


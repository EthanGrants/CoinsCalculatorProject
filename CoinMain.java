import java.util.Scanner;
/** CoinMain.java - Coin Name and Coin Value Exception Classes
 * <p>Problem Statement: Allow a child to enter coin names and corresponding values 
 * in his or her piggy bank.
 * </p>
 * 
 * <p>Algorithm: <br />
 * 1. Create main class <br/>
 * 2. Import scanner class <br/>
 * 3. Create string and int variables, have an attempts variable set to 3, the rest to zero and empty string <br/>
 * 4. Create a while loop that continues while attempts is greater than 0 <br/>
 * 5. In it, ask the user to enter the coin name, get their input, and convert it into a string. Allow for them to quit the
 *    program. <br/>
 * 6. Create a try and catch block to validate the names and allow exit, catch handles the name, and decrement the attempts, and continue <br/>
 * 7. Then ask for the coin's value, get their input, and then create a try and catch block. In it, have a switch set up based
 *    on coin name. Include each coin's value. If the value is correct, then include a counter. If it isn't, throw an exception. <br/>
 * 8. Repeat that for penny, nickel, dime, quarter, and half-dollar. Also add up the values in each. Then have a default that throws a CoinNameException. <br/>
 * 9. Have two catch blocks, one for CoinNameException and one for CoinValueException, decrement amount in each. Notify user
 *    if there are no more chances left. <br/>
 * 10. Outside of while loop, print out a table of the name, amount, and value of each coin category. Use counters and multiply
 *    them by their value for value categorty. Then at the end, total the value. <br/>
 * 11.Compile and test. <br/>
 * </p>
 * 
 *   @author Ethan Grant
 *   @version Module 13, Hw 1
 */
public class CoinMain
{
    public static void main(String[] args) {
        // variables
        String coinName = "";
        int coinValue = 0;
        int totalAmount = 0;
        int pennyCounter = 0; 
        int nickelCounter = 0;
        int dimeCounter = 0;
        int quarterCounter = 0; 
        int halfDollarCounter = 0;
        int value;
        int attempts = 3;
        // Exit once more than 3 tries have been made
        while(attempts > 0) {
            System.out.println("Please enter a coin name or \"quit\": ");
            // get user input
            Scanner input = new Scanner(System.in);
            // Convert to string
            coinName = input.nextLine().toLowerCase();
            // For names
            try {
                switch(coinName) {
                    case "penny":
                        break;
                    case "nickel":
                        break;
                    case "dime":
                        break;
                    case "quarter":
                        break;
                    case "half-dollar":
                        break;
                    case "quit":
                        break;
                    default:
                        throw new CoinNameException();
                }
            }
            catch (CoinNameException e) {
                System.out.println(e.getMessage());
                attempts--;
                continue;
            }
            // Allow user to leave
            if (coinName.equals("quit")) {
                break;
            }
            
            // Get coin value 
            System.out.println("Enter that coin's value in cents: ");
            coinValue = input.nextInt();
            try {
                switch (coinName) {
                    case "penny":
                        value = 1;
                        if (coinValue == value) {
                            pennyCounter++;
                            totalAmount += value;
                            System.out.println("So far you have " + totalAmount + " cents");
                        } else {
                            throw new CoinValueException();
                        }
                        break;
                    case "nickel":
                        value = 5;
                        if (coinValue == value) {
                            nickelCounter++;
                            totalAmount += value;
                            System.out.println("So far you have " + totalAmount + " cents");
                        } else {
                            throw new CoinValueException();
                        }
                        break;
                    case "dime":
                        value = 10;
                        if (coinValue == value) {
                            dimeCounter++;
                            totalAmount += value;
                            System.out.println("So far you have " + totalAmount + " cents");
                        } else {
                            throw new CoinValueException();
                        }
                        break;
                    case "quarter":
                        value = 25;
                        if (coinValue == value) {
                            quarterCounter++;
                            totalAmount += value;
                            System.out.println("So far you have " + totalAmount + " cents");
                        } else {
                            throw new CoinValueException();
                        }
                        break;
                    case "half-dollar":
                        value = 50;
                        if (coinValue == value) {
                            halfDollarCounter++;
                            totalAmount += value;
                            System.out.println("So far you have " + totalAmount + " cents");
                        } else {
                            throw new CoinValueException();
                        }
                        break;
                    default:
                        throw new CoinNameException();
                }
            }
            // for name errors
            catch (CoinNameException e) {
                System.out.println(e.getMessage());
                attempts--;
            }
            // For value errors
            catch (CoinValueException e) {
                System.out.println(e.getMessage());
                attempts--;
            }
            // Notify user no more errors are allowed
            if (attempts == 0) {
                System.out.println("No more chances.");
                break;
            }
        }
        // print out table
        System.out.println("    Coin      Count  Value");
        System.out.println("------------  -----  -----");
        System.out.printf("penny %12s %5d\n", pennyCounter, pennyCounter);
        System.out.printf("nickel %11s %5d\n", nickelCounter, nickelCounter * 5);
        System.out.printf("dime %13s %5d\n", dimeCounter, dimeCounter * 10);
        System.out.printf("quarter %10s %5d\n", quarterCounter, quarterCounter * 25);
        System.out.printf("half-dollar %6s %5d\n", halfDollarCounter, halfDollarCounter * 50);
        System.out.println("                    ======");
        System.out.printf("%18d cents total",totalAmount);
    }
}



/**
 * CoinValueException.java - Coin Name and Coin Value Exception Classes
 * 
 * <p>Problem Statement: Allow a child to enter coin names and corresponding values 
 * in his or her piggy bank.
 * </p>
 * <p> Instance variables: <br />
 *     N/A
 * </p>
 * 
 *   @author Ethan Grant
 *   @version Module 13, HW 1
 */
public class CoinValueException extends Exception
{
     /**
     * Constructs a default message 
     * Post-condition: object is created with default message
     * @return a new instance of CoinValueException with the default message
     */
    public CoinValueException() {
        super("Invalid amount");
    }
    /**
     * Constructs a default message which sets it to that string
     * Post-conditions: object is created with message set to that string
     * @return a new instance of CoinValueException with set to string
     * @param message sets exception message
     */
    public CoinValueException(String message) {
        super(message);
    }
}

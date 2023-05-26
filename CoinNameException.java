
/**
 * CoinNameException.java - Coin Name and Coin Value Exception Classes
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
public class CoinNameException extends Exception
{
     /**
     * Constructs a default message 
     * Post-condition: object is created with default message
     * @return a new instance of CoinNameException with the default message
     */
    public CoinNameException() {
        super("Invalid name");
    }
    
    /**
     * Constructs a default message which sets it to that string
     * Post-conditions: object is created with message set to that string
     * @return a new instance of CoinNameException with set to string
     * @param message sets exception message
     */
    public CoinNameException(String message) {
        super(message);
    }
}

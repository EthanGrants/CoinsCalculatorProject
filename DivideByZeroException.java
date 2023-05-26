
/**
 * DivideByZeroException.java - Calculator Exceptions 
 * 
 * <p>Problem Statement: Create a calculator which performs simple arithmetic functions and throws an exception if an operator
 * is unrecognized or if trying to divide by zero. 

 * </p>
 * <p> Instance variables: <br />
 *     N/A
 * </p>
 * 
 *   @author Ethan Grant
 *   @version Module 13, HW 2
 */
public class DivideByZeroException extends Exception
{
     /**
     * Constructs a default message 
     * Post-condition: object is created with default message
     * @return a new instance of DivideByZeroException with the default message
     */
    public DivideByZeroException() {
        super("Cannot divide by 0");
    }
    /**
     * Constructs a default message which sets it to that string
     * Post-conditions: object is created with message set to that string
     * @return a new instance of DivideByZeroException with set to string
     * @param message sets exception message
     */
    public DivideByZeroException(String message) {
        super(message);
    }
}
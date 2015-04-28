package myCalculator;

/**
 * 
 * @author WandreiMaik
 *
 * An exception thrown if a mathmatical operation is invalid.
 */
public class InvalidMathException extends Exception 
{
	InvalidMathException(String message)
	{
		super(message);
	}
}

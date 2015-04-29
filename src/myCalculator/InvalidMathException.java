package myCalculator;

/**
 * 
 * @author WandreiMaik
 *
 * An exception thrown if a mathmatical operation is invalid.
 */
public class InvalidMathException extends RuntimeException 
{
	InvalidMathException(String message)
	{
		super(message);
	}
}

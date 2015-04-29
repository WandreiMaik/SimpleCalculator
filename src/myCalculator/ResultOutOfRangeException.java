package myCalculator;

/**
 * 
 * @author WandreiMaik
 *
 * An exception thrown if a result is out of the possible data type range.
 */
public class ResultOutOfRangeException extends RuntimeException
{

	public ResultOutOfRangeException(String message) 
	{
		super(message);
	}
}

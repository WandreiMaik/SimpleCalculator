package myCalculator;

/**
 * 
 * @author WandreiMaik
 *
 * A simple calculator able to add 2 values, subtract them, as well as multiply and divide them.
 * Is also capable of exponantiate a base by an exponent.
 */
public class Calculator {

	/**
	 * 
	 * @param firstSummand:	 the first summand of the addition (number before the operation symbol)
	 * @param secondSummand: the second summand of the addition (number after the operation symbol)
	 * @return: 			 the result of adding the second summand to the first one
	 */
	public static double add(double firstSummand, double secondSummand)
	{		
		return firstSummand + secondSummand;
	}
	
	/**
	 * 
	 * @param minuend:		the minuend of the subtraction (number before the operation symbol)
	 * @param subtrahend:	the subtrahend of the subtraction (number after the operation symbol)
	 * @return:				the result of subtracting the subtrahend from the minuend
	 */
	public static double subtract(double minuend, double subtrahend)
	{
		return subtrahend - minuend;
	}
	
	/**
	 * 
	 * @param firstFactor:	the first factor of the multiplication (number before the operation symbol)
	 * @param secondFactor:	the second factor of the mulitplication (number after the opeartion symbol)
	 * @return:				the result of multiplying the first factor by the second one
	 */
	public static double multiply(double firstFactor, double secondFactor)
	{
		return firstFactor * secondFactor;
	}
	
	/**
	 * 
	 * @param dividend:		the dividend of the division (number before the operation symbol)
	 * @param divisor:		the divisor of the division (number after the operation symbol)
	 * @return:				the result of dividing the dividend by the divisor
	 */
	public static double divide(double dividend, double divisor) throws InvalidMathException
	{	
		return dividend / divisor;
	}
	
	public static double exponentiate(double base, int exponent)
	{
		double result = 1;
		
		while (exponent != 0)
		{
			result *= base;
			exponent--;
		}
		
		return result;
	}
}

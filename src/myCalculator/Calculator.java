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
	 * Calculates the addition of two values.
	 * 
	 * @param firstSummand:	 the first summand of the addition (number before the operation symbol)
	 * @param secondSummand: the second summand of the addition (number after the operation symbol)
	 * @return: 			 the result of adding the second summand to the first one
	 */
	public static double add(double firstSummand, double secondSummand)
	{		
	    double result = firstSummand + secondSummand;
	    
	    if (Double.isInfinite(result))
	    {
	        throw new ResultOutOfRangeException("The result of " + firstSummand + " plus " + secondSummand + " exceeds the bounds the software is capable to handle.");
	    }
	    
		return firstSummand + secondSummand;
	}
	
	/**
	 * Calculates the subtraction of two values.
	 * 
	 * @param minuend:		the minuend of the subtraction (number before the operation symbol)
	 * @param subtrahend:	the subtrahend of the subtraction (number after the operation symbol)
	 * @return:				the result of subtracting the subtrahend from the minuend
	 */
	public static double subtract(double minuend, double subtrahend)
	{
	    double result = minuend - subtrahend;
	    
	    if (Double.isInfinite(result))
	    {
	        throw new ResultOutOfRangeException("The result of " + minuend + " minus " + subtrahend + " exceeds the bounds the software is capable to handle.");
	    }
	    
		return minuend - subtrahend;
	}
	
	/**
	 * Calculates the multiplication of two values.
	 * 
	 * @param firstFactor:	the first factor of the multiplication (number before the operation symbol)
	 * @param secondFactor:	the second factor of the mulitplication (number after the opeartion symbol)
	 * @return:				the result of multiplying the first factor by the second one
	 */
	public static double multiply(double firstFactor, double secondFactor)
	{
	    double result = 0;
	    
	    if (Double.isInfinite(result))
	    {
	        throw new ResultOutOfRangeException("The result of " + firstFactor + " times " + secondFactor + " exceeds the bounds the software is capable to handle.");
	    }
	    
		return firstFactor * secondFactor;
	}
	
	/**
	 * Calculates the division of two values.
	 * 
	 * @param dividend:		the dividend of the division (number before the operation symbol)
	 * @param divisor:		the divisor of the division (number after the operation symbol)
	 * @return:				the result of dividing the dividend by the divisor
	 */
	public static double divide(double dividend, double divisor)
	{	
	    double result = 0;
	    
	    if (divisor == 0)
	    {
	        throw new InvalidMathException("You can't divide by zero.");
	    }
	    
	    result = dividend / divisor;
	    
	    if (Double.isInfinite(result))
	    {
	        throw new ResultOutOfRangeException("The result of " + dividend + " divided by " + divisor + " exceeds the bounds the software is capable to handle.");
	    }
	    
		return dividend / divisor;
	}
	
	/**
	 * Calculates the exponentiation of a value by another one.
	 * 
	 * @param base:        the base of the exponentiation (lower number)
	 * @param exponent:    the exponent of the exponentiation (number above the base)
	 * @return:            the exponentiation of the base by an integer exponent
	 */
	public static double exponentiate(double base, int exponent)
	{
		double result = 1;
		
		if (base == 0 && exponent != 0)
		{
		    return 0;
		}
		
		if (exponent < 0)
		{
		    while (exponent != 0)
		    {
		        result /= base;
		        exponent++;
		    }

		    if (Double.isInfinite(result))
		    {
		        throw new ResultOutOfRangeException("The result of " + base + " exponentiate by " + exponent + "exceeds the bounds the software is capable to handle.");
		    }
		    
		    return result;
		}
		
		while (exponent != 0)
		{
			result *= base;
			exponent--;
		}
		
        if (Double.isInfinite(result))
        {
            throw new ResultOutOfRangeException("The result of " + base + " exponentiate by " + exponent + "exceeds the bounds the software is capable to handle.");
        }
		
		return result;
	}
}

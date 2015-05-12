package myCalculator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class CalculatorTest
{

    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Test
    public void testAddExceptionRule()
    {
        double actual = 0;
        exception.expect(ResultOutOfRangeException.class);
        exception.expectMessage("The result of " + Double.MAX_VALUE +  " plus " + Double.MAX_VALUE + " exceeds the bounds the software is capable to handle.");
        
        actual = Calculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
        fail("You failed!");
    }

    @Test(expected = ResultOutOfRangeException.class)
    public void testAddExceptionTestAnnotation()
    {
        double actual = 0;
        
        actual = Calculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
        
        fail("You failed!");
    }
    
    @Test
    public void testAddExceptionTryCatch()
    {
        double actual = 0;
        
        try
        {
            actual = Calculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
            fail("You failed!");
        }
        catch (ResultOutOfRangeException exc)
        {
            assertEquals("The result of " + Double.MAX_VALUE +  " plus " + Double.MAX_VALUE + " exceeds the bounds the software is capable to handle.", exc.getMessage());
        }
    }
    
    @Test
    public void testAddSuccessfulCommon()
    {
        double actual = 0;
        
        actual = Calculator.add(4, 12);
        
        assertEquals("4 + 12", 16, actual, 0d);
    }
}

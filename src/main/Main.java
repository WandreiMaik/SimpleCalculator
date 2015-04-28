package main;

import myCalculator.Calculator;
import myCalculator.InvalidMathException;
import myCalculator.ResultOutOfRangeException;

public class Main {

	public static void main(String[] args)
	{
	    try
	    {
	        System.out.println(Calculator.exponentiate(12, 2));
	        System.out.println(Calculator.exponentiate(-12, 3));
	        System.out.println(Calculator.exponentiate(12, 0));
	        System.out.println(Calculator.exponentiate(0, 2));
	        System.out.println(Calculator.exponentiate(0, 1));
	        System.out.println(Calculator.exponentiate(12, 768237857));   
	    }
	    catch(ResultOutOfRangeException exc)
	    {
	        System.out.println(exc.getMessage());
	    }
	}
	
}

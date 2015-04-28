package main;

import myCalculator.Calculator;

public class Main {

	public static void main(String[] args)
	{
		System.out.println(Calculator.exponentiate(12, 2));
		System.out.println(Calculator.exponentiate(-12, 3));
		System.out.println(Calculator.exponentiate(12, 0));
		System.out.println(Calculator.exponentiate(0, 2));
		System.out.println(Calculator.exponentiate(0, 1));
		System.out.println(Calculator.exponentiate(0, 0));
	}
	
}

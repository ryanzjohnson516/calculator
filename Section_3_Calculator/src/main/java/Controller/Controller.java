package Controller;

import lib.ConsoleIO;
import models.Polynomial;

public class Controller 
{
	
	public static double MaxNumOfExponents = 50;
	public static double MaxNumOfCoefficients = 255;

	public static void main(String[] args) 
	{
		Run();

	}
	
	public static void Run()
	{
		
		RunMainMenu();
		
	}
	
	public static void RunMainMenu()
	{
		int choice  = -1;
		
		choice = ConsoleIO.promptForInt("1: Simplifying Polynomials.\n2: Rational Functions. \nAnswer Here: ", 1, 3);
		
		switch (choice)
		{
			case 1: 
				SimplifyingPolynomials();
				break;
				
			case 2: 
				RationalFunctions();
				break;
				
			case 3: 
				//TODO
				break;
				
			default:
				System.out.println("Error. In Menu One.");
				break;
		}
		
	}
	
	public static void SimplifyingPolynomials()
	{
		double highestExponentCountingDown;
		double highestExponent = ConsoleIO.promptForInt("What is the highest Exponent : ", 1, (int) MaxNumOfExponents);
		highestExponentCountingDown = highestExponent;
		double[] coefficients = new double[(int) highestExponent];
		
		for(int i = 0; i < highestExponent; i++)
		{
			
			coefficients[i] = ConsoleIO.promptForInt("What is the coefficent for the " + highestExponentCountingDown + "th exponent.\nAnswer: ", 0, (int) MaxNumOfCoefficients);
			highestExponentCountingDown--;
			
		}
		
		Polynomial polynomial = new Polynomial(highestExponent, coefficients);
		
		polynomial.print();
		
	}
	
	public static void RationalFunctions()
	{
		
	}
	

}

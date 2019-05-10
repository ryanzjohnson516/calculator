package Controller;

import lib.ConsoleIO;

public class Controller 
{

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
		
	}
	
	public static void RationalFunctions()
	{
		
	}
	

}

package models;

public class Polynomial {
	
	public double HighestExponent;
	public double[] coefficients;

	public Polynomial() {}
	
	public Polynomial(double HighestExponent, double[] coefficients) 
	{
		this.HighestExponent = HighestExponent;
		this.coefficients = coefficients;
	}
	
	public double getNumOfComplexRoots()
	{
		return HighestExponent;
	}
	
	public double[] getPossibleNumOfRealRoots()
	{
		double[] NumOfRealRoots = new double[(int) (HighestExponent / 2)];
		
		if(HighestExponent % 2 == 0) 
		{
			for(int i = 0; i < HighestExponent; i+=2)
			{
				NumOfRealRoots[i] = HighestExponent;	
			}
		}
		else
		{
			for(int i = 1; i< HighestExponent; i+=2)
			{
				NumOfRealRoots[i] = HighestExponent;
			}
			
		}
		
		return NumOfRealRoots;
	}
	
	
	public void Print()
	{
		
	}
}

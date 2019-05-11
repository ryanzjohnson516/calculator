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
		double[] NumOfRealRoots = new double[(int) (((HighestExponent)/2) + 1)];
		
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
	
	public double[] getPossibleNumOfImaginaryRoots()
	{
		double[] NumOfImaginaryRoots = new double[(int) (((HighestExponent)/2) + 1)];
		
		for(int i = 1; i< HighestExponent; i+=2)
		{
			NumOfImaginaryRoots[i] = HighestExponent;
		}
		
		return NumOfImaginaryRoots;
	}
	
	public double[] getNumOfPosotiveRealRoots()
	{
		double[] numOfPosRootsArray = new double[(int) HighestExponent];
		double numOfPosRoots = 0;
		for(int i = 0; i < coefficients.length; i++)
		{
			if(coefficients[i] < 0 && coefficients[i + 1] > 0)
			{
				numOfPosRoots++;
			}
			else if(coefficients[i] > 0 && coefficients[i + 1] < 0)
			{
				numOfPosRoots++;
			}
		}
		
		numOfPosRootsArray[0] = numOfPosRoots;
		int q = 1;
		for(int i = (int) (numOfPosRoots - 2); i > 0; i-=2)
		{
			numOfPosRootsArray[q] = i;
			q++;
		}
		
		return numOfPosRootsArray;
	}
	
	public double[] getNumOfNegativeRealRoots()
	{
		double[] numOfNegRealRoots = new double[(int) HighestExponent];
		
		
		//ToDo
		return null;
	}
	
	public void Print()
	{
		
	}
}

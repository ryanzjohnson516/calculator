package models;

public class Quadratic {

	public double a = 0;
	public double b = 0;
	public double c = 0;
	public double posx = 0;
	public double negx = 0;
	public double yint = 0;
	public double vertexX = 0;
	public double vertexY = 0;
	public double squaree = 0;
	public double squarerooted = 0;
	
	
	public Quadratic(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		yint = c;
		squaree = (b*b) - (4*(a)*(c));
		squarerooted = Math.sqrt(squaree);
		findPosX();
		findNegX();
	}

	
	public void findPosX() {
		posx = (-b) + squarerooted / (2*(a));
	} 
	
	public void findNegX() {
		negx = (-b) - squarerooted / (2*(a));
	}

	public double getPosx() {
		return posx;
	}


	public double getNegx() {
		return negx;
	}

	public double getYint() {
		return yint;
	}


	public double getVertexX() {
		return vertexX;
	}

	public double getVertexY() {
		return vertexY;
	}


	
	
	
	
}

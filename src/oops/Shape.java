package oops;

public abstract class Shape {

	private int noOfSides,area,perimeter;
	
	protected abstract float calculateArea(float a);
	protected abstract float calculatePerimeter(float a);
	protected abstract void setSides(float s);
	
	public int getNoOfSides() {
		return noOfSides;
	}
	public void setNoOfSides(int noOfSides) {
		this.noOfSides = noOfSides;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}
	
	
}

package oops;

public class Circle extends Shape implements ShapeConstants{

	
	
	public Circle() {
		super();
		
	}

	public static void main(String[] args) {


	}

	@Override
	protected float calculateArea(float a) {
		return 0;
	}

	@Override
	protected float calculatePerimeter(float a) {
		return 0;
	}

	@Override
	protected void setSides(float s) {
		noOfSides =s;
	}

}

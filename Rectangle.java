package polygons;

public class Rectangle extends Polygon{
	private double side1;
	private double side2;
	
	public Rectangle(double side1, double side2) {
		super(2);// React Sides
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}

	@Override
	public String toString() {
		return "Rectangle: \n" + super.toString() +"side1=" + side1 + ", side2=" + side2;
	}
	
	@Override
	public double area() {
		return side1 * side2;
	}
}

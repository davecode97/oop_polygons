package polygons;

public abstract class Polygon {
	protected int sidesNumber;

	public Polygon(int sides) {
		super();
		sidesNumber = sides;
	}
	
	public int getSidesNumber() {
		return sidesNumber;
	}
	
	@Override
	public String toString() {
		return "Polygon{" + "Sides Number=" + sidesNumber + "}";
	}
	
	public abstract double area();
	
}

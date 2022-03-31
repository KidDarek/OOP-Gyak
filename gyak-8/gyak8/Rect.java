package gyak8;

public class Rect extends Gyak8 {
	

	private double a;
	private double b;
	
	public Rect(double a, double b, int height)
	{
	super(height);
	this.a = a;
	this.b = b;
	}
	
	@Override
	public double getBase()
	{
		return a * b;
	}

	@Override
	public String toString() {
		return "Rect [a=" + a + ", b=" + b + ", getBase()=" + getBase() + ", getVolume()=" + getVolume()
				+ ", getHeight()=" + getHeight() + "]";
	}
	
	
}

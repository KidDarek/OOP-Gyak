package gyak8;

public class Cilinder extends Gyak8 {

	double radius;
	
	public Cilinder(double radius, int height)
	{
	super(height);
	this.radius = radius;
	}
	
	@Override
	public double getBase()
	{
		return radius * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "Cilinder [radius=" + radius + ", getBase()=" + getBase() + ", getVolume()=" + getVolume()
				+ ", getHeight()=" + getHeight() + "]";
	}
}

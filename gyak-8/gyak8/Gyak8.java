package gyak8;

public abstract class Gyak8 {
	private int height;
	
	public abstract double getBase();
	
	public double getVolume()
	{
		return this.getBase()* height;
	}
	
	public boolean isLarger(Gyak8 other)
	{
		return this.getVolume() > other.getVolume();
	}

	public Gyak8(int height) {
		super();
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHieight(int height) {
		this.height = height;
	}


}

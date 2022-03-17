package myPackage.first;

public class Szam {	
	private double tures = 0.0001;
	private double valos;
	public Szam(double valos) {
		super();
		this.valos = valos;
	}
	public boolean inTheRange(double valos)
	{
		if(this.valos - valos <= tures)
		{
			return true;
		}
	return false;	
	}
	public double getValos() {
		return valos;
	}
	public void setValos(double valos) {
		this.valos = valos;
	}
	public double getTures() {
		return tures;
	}
	

}

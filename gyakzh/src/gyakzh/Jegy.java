package gyakzh;

import java.time.LocalDate;

public class Jegy {
	
	private LocalDate datum;
	public enum Kedvezmeny
	{
		DIAK,NYUGDIJAS,TELJESARU;
	}
	private Kedvezmeny kedvezmeny;
	
	public Jegy(LocalDate datum, Kedvezmeny kedvezmeny) {
		this.datum = datum;
		this.kedvezmeny = kedvezmeny;
	}

	public LocalDate getDatum() {
		return datum;
	}

	public Kedvezmeny getKedvezmeny() {
		return kedvezmeny;
	}

	@Override
	public String toString() {
		return "Jegy [datum=" + datum + ", kedvezmeny=" + kedvezmeny + "]";
	}
	
	public int jegyar(Kedvezmeny kedvezmeny)
	{
		return 0;
	}
	

}

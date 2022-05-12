package gyakzh;

import java.time.LocalDate;


public class ICjegy extends Jegy {
	
	private String nev;
	private int kocsiosztaly;
	private int tavolsag;
	private int kmAr;
    private final int potjegy = 450;
    
	public ICjegy(LocalDate datum, Kedvezmeny kedvezmeny, String nev, int kocsiosztaly, int tavolsag) {
		super(datum, kedvezmeny);
		this.nev = nev;
		this.kocsiosztaly = kocsiosztaly;
		this.tavolsag = tavolsag;
		if(kocsiosztaly == 1)
		{
			this.kmAr = 30;
		}
		else if(kocsiosztaly == 2)
		{
			this.kmAr = 25;
		}
	}
	
	
	
	public String getNev() {
		return nev;
	}



	public int getKocsiosztaly() {
		return kocsiosztaly;
	}



	public int getTavolsag() {
		return tavolsag;
	}



	public int getKmAr() {
		return kmAr;
	}



	@Override
	public int jegyar(Kedvezmeny kedvezmeny)
	{
		double kedv;
		switch(kedvezmeny)
		{
		case DIAK:
			kedv = 0.5;
			break;
		case NYUGDIJAS:
				kedv = 0.9;
				break;
		case TELJESARU:
			kedv = 1;
			break;
			default:
				kedv = 1;
				break;
		}
		double jegyar = (tavolsag*kmAr)*kedv+potjegy;
		return (int) Math.round(jegyar);
		
		
	}

	@Override
	public String toString() {
		return "ICjegy [nev=" + nev + ", kocsiosztaly=" + kocsiosztaly + ", tavolsag=" + tavolsag + ", kmAr=" + kmAr
				+ ", potjegy=" + potjegy + " jegyar "+ this.jegyar(getKedvezmeny())+ "]";
	}
	
	public static void arrayWrite(ICjegy[] icJegy)
	{
		for(int i = 0 ; i < icJegy.length; i++)
		{
			System.out.println(icJegy[i]);
		}
	}
	
	public static ICjegy[] laterThan(ICjegy[] icJegy, LocalDate datum)
	{
		int lep = 0;
		ICjegy[] kesobbiJegyek = new ICjegy[icJegy.length];
		for(int i = 0 ; i < icJegy.length; i++)
		{
			if(icJegy[i].getDatum().isAfter(datum))
			{
				kesobbiJegyek[lep] = icJegy[i];
				lep++;
			}
		}
		return kesobbiJegyek;
	}
    
    

}

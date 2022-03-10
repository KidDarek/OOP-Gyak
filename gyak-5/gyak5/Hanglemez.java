package gyak5;

public class Hanglemez {
	String eloadob = "asd";
	String cimb = "asd";
	int idob = 3;
	String eloado;
	String cim;
	int ido;
	public Hanglemez(String eloado, String cim, int ido) {
		this.eloado = eloado;
		this.cim = cim;
		this.ido = ido;
	}
	public String getEloado() {
		return eloado;
	}
	public void setEloado(String eloado) {
		this.eloado = eloado;
	}
	public String getCim() {
		return cim;
	}
	public void setCim(String cim) {
		this.cim = cim;
	}
	public int getIdo() {
		return ido;
	}
	public void setIdo(int ido) {
		this.ido = ido;
	}

	public void writeData(Hanglemez adat)
	{
		System.out.println(eloado + ": " + cim + ", " + ido + " perc" );
	}
	public int lenghtType(Hanglemez adat)
	{
		if(adat.ido < idob)
		{
			return 1;
		}
		else if(adat.ido == idob)
		{
		 return 0;	
		}
		else
		{
		  return -1;	
		}
	}
	public boolean checkWriter(Hanglemez adat)
	{
		return adat.eloado.equals(eloadob);
	}

}



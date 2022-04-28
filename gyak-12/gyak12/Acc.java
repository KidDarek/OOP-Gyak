package gyak12;

import exept.Exeption;

public class Acc {
	
	private String acc;
	private int funds = 0;
	
	public Acc(String acc) {
		this.acc = acc;
	}

	public String getAcc() {
		return acc;
	}
	public void takeFund(int fund) throws Exeption	{
		if(fund > funds)
		{
		throw new Exeption(Math.abs(funds-fund));	
		}
		funds -= fund;
	}
	

	public int getFunds() {
		return funds;
	}
	
	@Override
	public String toString() {
		return "Acc [acc=" + acc + ", funds=" + funds + "]";
	}

	public void raiseFunds(int raise)
	{
		this.funds += raise;
	}
	

}

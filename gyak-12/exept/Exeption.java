package exept;

public class Exeption extends Exception {
	
	private int missingfund;

	public Exeption(int missingfund) {
		super();
		this.missingfund = missingfund;
	}

	public int getMissingfund() {
		return missingfund;
	}
}

package myProd;

public class kenyer extends Product {

	private double amount;

	public kenyer(String name, int price, int rKey,double amount) {
		super(name, price, rKey);
		this.amount = amount;
	}
	
	public double unitprice = super.grossPrice() / amount;;
	
	@Override
	public String toString()
	{
		return super.toString() + " - " + unitprice;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public static boolean unitPrice(kenyer bread1,kenyer bread2)
	{
		return bread1.unitprice < bread2.unitprice;
	}

}

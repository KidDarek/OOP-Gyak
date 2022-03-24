package myProd;

public class Product {
	private String name;
	private int price;
	private int rKey;
	
	public Product(String name, int price, int rKey) {
		super();
		this.name = name;
		this.price = price;
		this.rKey = rKey;
	}
	
	public int grossPrice()
	{
		double mult = ((double)rKey / 100 ) + 1;
		return (int)(price * mult);
	}	
	
	public void raisePrice(int percent)
	{
		double mult = ((double)percent / 100 ) + 1;
		price *= mult;
	}	
	
	public int comparePrice(Product prod)
	{
	 if(this.grossPrice() == prod.grossPrice())
	 	{
			return 0;
		}
	 else if(this.grossPrice() < prod.grossPrice())
	 	{
			return -1;
		}
	 else
	 	{
		return 1;	
		}
	}
	
	@Override
	public String toString()
	{
		return name + " brutto ar " + grossPrice();
	}
	
	
}

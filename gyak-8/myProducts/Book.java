package myProducts;

public class Book extends Product {
	private String author;
	private String title;
	private int yearOfPublication;
	private int price;
	java.util.Calendar cal = java.util.Calendar.getInstance();
	
	public void increasePrice(int percentage) {
		if (percentage > 0) {
			price += Math.round(price*(float)percentage/100);
		}	
	}
	
	public Book(String author, String title, int yearOfPublication, int price) {
		super();
		this.author = author;
		this.title = title;
		this.yearOfPublication = yearOfPublication;
		this.price = price;
	}
	public Book(String author, String title) {
		this.author = author;
		this.title = title;
		this.yearOfPublication = cal.get(java.util.Calendar.YEAR);
		this.price = 2500;
	}

	public String displayInfo() {
		return author + ": " + title + ", " + yearOfPublication + ". Price: " + price + " Ft";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		if (yearOfPublication >= 1950 && yearOfPublication <= 2021)
			this.yearOfPublication = yearOfPublication;
		else 
			this.yearOfPublication = 2021;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 1000)
			this.price = price;
		else
			this.price = 1000;
	}
	
	public static int comparePublicationDate(Book book1, Book book2)
	{
		if(book1.yearOfPublication > book2.yearOfPublication)
		{
			return 1;
		}
		if(book1.yearOfPublication < book2.yearOfPublication)
		{
			return 2;
		}
		else
		{
			return 0;
		}
	}
	
	public double unitPrice(int price, int pages)
	{
		return price / pages;
	}
	
	@Override
	public String toString()
	{
		return displayInfo();
	}

}
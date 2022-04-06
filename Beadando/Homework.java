package homework;

public class Homework {
	
	public static void main(String[] args)  {
		
		Book book1 = new Book("J.K.Rowling","Harry potter",2000, 3000);
		Book book2 = new Book("borger","Harry pot");
		System.out.println(book1.displayInfo());
		System.out.println(book2.displayInfo());
		System.out.println(book1.comparePublicationDate(book1, book2));
	}
}

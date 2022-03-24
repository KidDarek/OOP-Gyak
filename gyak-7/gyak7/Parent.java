package gyak7;

public class Parent extends Person {
	
	private String workplace;

	public Parent(String name, int age, String workplace) {
		super(name, age);
		this.workplace = workplace;
		
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " - " + workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public String getWorkplace() {
		return workplace;
	}
	
	

}

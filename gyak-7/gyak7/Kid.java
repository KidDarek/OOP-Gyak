package gyak7;

public class Kid extends Person {
	
	private String school;

	public Kid(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " - " + school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	

}

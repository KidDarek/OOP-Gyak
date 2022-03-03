package main;

class Employee
{
	private int salary;
	private String name;
	int age;
	
	void salaryraise(int raise)
	{
		salary+=raise;
	}
	public String toString()
	{
		return name + " " + salary;
	}
	
	boolean iswithinBoundries(int lower, int upper)
	{
		return lower <= salary && upper >= salary;
	}
	
	public int getTax()
	{
		return (int)(salary*0.15);
	}
	public boolean hasHigherSalary(Employee emp)
	{
		return salary > emp.getSalary();
	}
	
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}

}

public class Gyak4
{
	
	public static void main(String[] args)
	{
		Employee emp = new Employee();
		Employee emp2 = new Employee();
		//emp.salary = 10;
		//emp.name = "Nagy Lajos a második";
		emp.setName("Nagy Lajcsi");
		emp.setSalary(100);
		emp2.setName("Nagy Leonárdó");
		emp2.setSalary(120);
		System.out.println(emp.toString());
		emp.salaryraise(50);
		System.out.println(emp2.toString());
		System.out.println("Is within: " + emp.iswithinBoundries(10, 200));
		System.out.println("Is within: " + emp2.iswithinBoundries(10, 200));
		System.out.println("Tax " + emp.getTax());
		System.out.println("Greater salary " + emp.hasHigherSalary(emp2));
		
		
	}

}

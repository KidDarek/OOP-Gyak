package gyak6;

public class Employee {
	private String name;
	private int age;
	private int salary;

	private static int retirementAge = 65;

	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Employee(String name, int age) {
		this(name, age, age*10000);
	}
	public int yearsToRetirement()
	{
		return retirementAge - age;
	}
	@Override
	public String toString() {
		return "Employee name=" + name + ", age=" + age + ", salary=" + salary + ", yearsToRetirement()="
				+ yearsToRetirement();
	}
	
	public static void setRetirementAge(int retirementAge)
	{
		Employee.retirementAge = retirementAge;
	}
	static void fiveToGo(Employee[] emps, int n)
	{
		for(Employee emp : emps)
		{
			if(emp.yearsToRetirement() <= 5)
			{
			System.out.println(emp);	
			}
		}
	}
	static int avg(Employee[] emps)
	{
	int sum = 0;
	for(int i = 0 ; i < emps.length; i++)
	{
		sum += emps[i].age;
	}
	return sum/emps.length;
	}

}

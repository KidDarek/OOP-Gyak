package gyak6;

import java.util.Scanner;

public class main1 {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] Args)
	{
		int n = 3;
		Employee[] emps = new Employee[n];
		for(int i = 0; i < emps.length; i++)
		{
			emps[i] = readEmp();
		}
		//Before retirement age up
		printEmployee(emps);
		Employee.setRetirementAge(70);
		//After the up
		printEmployee(emps);
		sc.close();
	}
	
	static Employee readEmp()
	{
		System.out.println("Name here:");
		String name =sc.nextLine();
		System.out.println("Age here:");
		int age =Integer.parseInt(sc.nextLine());
		System.out.println("salary here:");
		int salary =Integer.parseInt(sc.nextLine());
		return new Employee(name, age, salary);
	}
	
	static void printEmployee(Employee[] emps)
	{
	for(int i = 0 ; i < emps.length; i++)
	{
		System.out.println(emps[i]);
	}
	}

}

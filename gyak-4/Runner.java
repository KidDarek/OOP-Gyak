package main;

import java.util.Scanner;

public class Runner {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] Args)
	{
		Employee[] emps = new Employee[5];

		for(int i = 0 ; i < emps.length; i++)
		{
			emps[i] = new Employee();
			readEmployee(emps[i]);
		}
		sc.close();
	}

	static int indexOfTheHighest(Employee[] emps)
	{
		int next = 0;
		for(int i = 1; i <= emps.length; i++)
		{
			if(emps[i].hasHigherSalary(emps[next]));
			{
				next = i;
			}
		}
	return next;	
	}
	
	static int salaryinterval(Employee[] emps, int lower,int upper)
	{
		int count = 0;
		for(int i = 0 ; i < emps.length;i++)
		{
		 if(emps[i].iswithinBoundries(lower, upper));
			{
			count++;	
			}
		}
		return count;
		
	}
	static int Avrg(Employee[] emps)
	{
		int sum = 0 ;
	for(int i = 0 ; i < emps.length; i++)
	{
		sum += emps[i].getSalary();
	}
	return sum/emps.length;
	}
	
	
	static void readEmployee(Employee emp)
	{
		String name = sc.nextLine();
		int salary = Integer.parseInt(sc.nextLine());
		emp.setName(name);
		emp.setSalary(salary);
	}
}

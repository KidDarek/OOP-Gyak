package files;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class File {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] Args)
	{
	List<String> names = new ArrayList<>();	
	boolean finished = false;
	while(finished)
	{
	System.out.println("Name? ");
	String name = sc.nextLine();
	names.add(name);
	}
	}

}

import java.util.*;
class Girlfriend
{
	void girl(String name, String location, int age)
	{
		System.out.println("Name: " +name+ "\nAge: "+age+ "\nLocation: "+location);
		System.out.println("You are in Super class ");
	}
}
public class Overriding_Example_two extends Girlfriend
{
	void girl(String name, String location, int age)
	{   System.out.println("++++++++++============== Main method ====================++++++++++++");
		System.out.println("Name: " +name+ "\nAge: "+age+ "\nLocation: "+location);
		System.out.println("You are in main class's main method");
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter location: ");
		String location  = sc.nextLine();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		Girlfriend a = new Girlfriend();
		a.girl(name, location, age);
		Overriding_Example_two s = new Overriding_Example_two();
		s.girl(name, location, age);
		
		
	
	}
}

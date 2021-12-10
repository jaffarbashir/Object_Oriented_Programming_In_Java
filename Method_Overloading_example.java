
public class Method_Overloading_example
{
	void king(String name, int age)
	{
		System.out.println("Name of the king is: "+name);
		System.out.println("Age of "+name +" is "+age);
	}
	void king(int age, String name)
	{
		System.out.println("Age is: "+age);
	}
	public static void main(String [] args)
	{
		Method_Overloading_example e = new Method_Overloading_example();
		e.king(10,null);
	}
}

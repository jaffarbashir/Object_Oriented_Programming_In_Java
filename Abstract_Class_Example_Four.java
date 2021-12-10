interface First
{
	void A();
	void B();
	void C();
}
abstract class Second implements First
{
	public void D()
	{
		System.out.println("I am in Second class");
	}
}
class Third extends Second
{
	public void A()
	{
		System.out.println("I am A of interface.");		
	}

	public void B()
	{
		System.out.println("I am B of interface.");
	}

	public void C()
	{
		System.out.println("I am C of interface.");
		
	}
}
public class Abstract_Class_Example_Four 
{
	public static void main (String [] args)
	{
		Third obj = new Third();
		obj.A();
		obj.B();
		obj.C();
		obj.D();
	}
}

interface First1
{
	public abstract void A();
}
public class Interface_Example_One implements First1
{
		public void A()
		{
			System.out.println("This is the first example of Interface.");
		}
	public static void main(String [] args)
	{
		System.out.println("I am in main method.");
		Interface_Example_One eg = new Interface_Example_One();
		eg.A();
	}
}

abstract class Vehicle
{
	abstract void start();
}
class Bike extends Vehicle
{
	void start()
	{
		System.out.println("Starts with kick");
	}
}
public class Abstract_Example_One extends Vehicle
{
  void start()
  {
	  System.out.println("Starts with Key");
  }
  public static void main(String [] args)
  {
	  Abstract_Example_One obj1 = new Abstract_Example_One();
	  Bike obj2 = new Bike();
	  obj1.start();
	  obj2.start();
  }
}


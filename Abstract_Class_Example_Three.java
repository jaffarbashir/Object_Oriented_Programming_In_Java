abstract class Vehicles
{
	Vehicles()
	{
		System.out.println("I am creating a Vehicle class");
	}
	abstract void tyres();
	void brakes()
	{
		System.out.println("I have break");
	}
	
}
class Bikkey extends Vehicles
{
	void tyres()
	{
		System.out.println("I am a bike and have two tyres");
	}
}
class Bus extends Vehicles
{
	void tyres()
	{
		System.out.println("I am a bus and have 6 tyres");
	}
}
public class Abstract_Class_Example_Three 
{
	public static void main(String [] args)
	{
		//Abstract_Class_Example_Three obj1 = new Abstract_Class_Example_Three();
		Bikkey obj2 = new Bikkey();
		
		
		obj2.tyres();
		Bus obj3 = new Bus();
		obj3.tyres();
		
	}
}

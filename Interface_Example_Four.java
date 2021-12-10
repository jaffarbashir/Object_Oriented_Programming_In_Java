interface Printable
{
	public abstract void Pari();
}
interface Showable
{
	public abstract void Sho();
}
class Interface_Example_Four implements Printable, Showable
{
	public void Pari()
	{
		System.out.println("I am in pari method of Printable Interface");
	}
	public void Sho()
	{
		System.out.println("I am in Sho method of Showable Interface ");
	}
	public static void main(String [] args)
	{
		Interface_Example_Four a = new Interface_Example_Four();
		a.Sho();
		a.Pari();
	}
}

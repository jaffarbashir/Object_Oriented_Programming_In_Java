interface Oe
{
	void sh();
}
interface To extends Oe
{
	void h();
}
public class Interface_Example_5 implements To
{
	public void sh()
	{
		System.out.println("COme in i am sh method of Oe");
	}
	public void h()
	{
		System.out.println("Come in i am h method of To");
	}
	public static void main(String [] args )
	{
		Interface_Example_5 aj = new Interface_Example_5();
		aj.sh();
		aj.h();
	}
}

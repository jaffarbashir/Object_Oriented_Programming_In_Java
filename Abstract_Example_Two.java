abstract class Bank
{
	abstract int Rate_of_Interest();
}
class SBI extends Bank
{
	int Rate_of_Interest()
	{
		String rate = "8%";
		return 8;
	}
}
class PNB extends Bank
{
	int Rate_of_Interest()
	{
		return 6;
	}
}
class JKB extends Bank
{
	int Rate_of_Interest()
	{
		return 12;
	}
}
public class Abstract_Example_Two
{
	public static void main(String [] args)
	{
		SBI obj1 = new SBI();
		PNB obj2 = new PNB();
		JKB obj3 = new JKB();
		System.out.println(obj1.Rate_of_Interest());
		System.out.println(obj2.Rate_of_Interest());
		System.out.println(obj3.Rate_of_Interest());
	}
}

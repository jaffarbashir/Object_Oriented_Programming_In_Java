interface PBank
{
	public abstract float rate_of_interest();
}
class SBIN implements PBank
{
	public float rate_of_interest()
	{
		return 6.7f;
	}
}
class PNBN implements PBank
{
	public float rate_of_interest()
	{
		return 5.8f;
	}
}
public class Interface_Example_Three
{
	public static void main(String [] args)
	{
		SBIN s = new SBIN();
		System.out.println(s.rate_of_interest());
		PNBN p = new PNBN();
		System.out.println(p.rate_of_interest());
	}
}

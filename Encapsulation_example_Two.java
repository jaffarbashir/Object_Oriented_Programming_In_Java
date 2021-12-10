class King
{
	private String name;
	public void setname(String n)
	{
		name = n;
	}
	public String getname()
	{
		return name;
	}
}

public class Encapsulation_example_Two
{
public static void main(String [] args)
		{
			King ae = new King();
			ae.setname("Jaffar");
			String k = ae.getname();
			System.out.println(k);
			
		}
}

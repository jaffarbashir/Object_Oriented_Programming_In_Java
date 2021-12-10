class Kha
{
	void born()
	{
		System.out.println("I was born in tanta");
	}
}
class Bas extends Kha
{
	void borna()
	{
		System.out.println("I was born in assisse");
	}
}
class Hierarch extends Bas {
	void good()
	{
		System.out.println("FM");
	}
public static void main(String [] args)
{   
	
	Hierarch n = new Hierarch();
	n.born();
	n.borna();
	n.good();
}
}

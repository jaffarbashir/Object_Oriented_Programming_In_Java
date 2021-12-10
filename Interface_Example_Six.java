interface Def
{	
	void D();
	//default void M()
	//{
		//System.out.println("I am a default method in interface");
	//}
}
public class Interface_Example_Six 
{ 
	public void D()
	{
		System.out.println("Hii");
	}
	public static void main(String [] args)
	{
		Interface_Example_Six s = new Interface_Example_Six();
		//s.M();
		s.D();
	}

}

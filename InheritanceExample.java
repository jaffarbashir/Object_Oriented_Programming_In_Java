class Jaffar
{
	void surname()
	{
		System.out.println("My surname is Bashir");
	}
	
}
public class InheritanceExample extends Jaffar 
{
void name()
{
	System.out.println("Hii guys I am Jaffar");
}
	public static void main(String [] args)
	{
		System.out.println("Hii Mother");
		InheritanceExample a = new InheritanceExample();
		a.surname();
		a.name();
	}
}



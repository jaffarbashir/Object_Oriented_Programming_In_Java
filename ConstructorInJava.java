//Program for Constructor
public class ConstructorInJava
{
	String name;
	int id;
	ConstructorInJava(String name, int id)
	{
		this.name = name;
		this.id = id;
	}

public static void main(String [] args)
{
	ConstructorInJava j = new ConstructorInJava("Jaffar",1);
	System.out.println(j.name + j.id);
}
}
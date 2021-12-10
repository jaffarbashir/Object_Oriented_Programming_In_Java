class ji
{
	void P()
	{
		System.out.println("I have a cycle");
	}
}
class j extends ji
{
	void Po()
	{
		System.out.println("I have a cycle and Bike");
	}
}
public class MultipleInheritanceExample extends j
{
public static void main(String [] args)
{
	MultipleInheritanceExample k = new MultipleInheritanceExample();
	k.Po();
	k.P();
}
}

public class Multiply_two_String
{
	int multiply_string(String s1, String s2)
	{
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		return n1*n2;
	}
public static void main(String [] args)
{ 
	Multiply_two_String ob = new Multiply_two_String();
	System.out.println(ob.multiply_string("33", "2"));
	
}
}

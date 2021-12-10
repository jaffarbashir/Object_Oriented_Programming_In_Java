import java.io.FileInputStream;
public class JavaException 
{
	public static void main(String [] args)
	{
		try
		{
	//int a = 10, b = 0, c = a/b;
		FileInputStream fis = new FileInputStream("c:/abc.txt");
	//System.out.println(c);
	}
		catch(Exception e)
		{
			//System.out.println("You bloody idiot you cant divide by zero.");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Good mother fuckers");
		}
	}
}

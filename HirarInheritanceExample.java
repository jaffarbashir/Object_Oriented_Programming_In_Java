class K
{
 void kk()
 {
	 System.out.println("I am in the K");
 }
}
class jo extends K
{
	void jj()
	{
		System.out.println("Hello i am in J");
	}
}
class l extends K
{
	void ll()
	{
		System.out.println("I am in l");
	}
}
public class HirarInheritanceExample 
{
public static void main(String [] args)
{
	jo n = new jo();
	l s = new l();
	n.kk();
	n.jj();
	s.ll();
}
}

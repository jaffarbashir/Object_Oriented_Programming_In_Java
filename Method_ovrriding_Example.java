class Test
{
	void showm(String name, int age, int salery)
	{
		System.out.println("Name: " +name + "\nAge "+age +"\nSalery: "+salery);
		System.out.println("You are in test class");
	}
	
}
public class Method_ovrriding_Example extends Test
{   void showm(String name, int age, int salery)
	{  System.out.println("============== You are in main class ===================");
		System.out.println("Name: " +name + "\nAge "+age +"\nSalery: "+salery);
		System.out.println("You are in Main class");
	}  
		public static void main(String [] args)
		{
			Test t = new Test();
			t.showm("Jaffar", 23, 26700);
			Method_ovrriding_Example a = new Method_ovrriding_Example();
			a.showm("Adil", 24, 12000);
			
			
		}
}

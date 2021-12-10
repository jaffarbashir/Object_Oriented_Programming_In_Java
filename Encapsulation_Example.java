class Employee
{
	private int emp_id;
	public void setemp(int eid)
	{
		emp_id = eid;
	}
	public int getemp()
	{
		return emp_id;
	}
	
}
public class Encapsulation_Example 
{
		public static void main(String [] args)
		{
			Employee e = new Employee();
			e.setemp(101);
			System.out.println(e.getemp());
		}
}

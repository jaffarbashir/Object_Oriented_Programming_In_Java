interface Drawable
{
	public abstract void Draw();
	
}
class Circle implements Drawable
{
	public void Draw()
	{
		System.out.println("I am gonna draw a Circle");
	}
}
class Rectangle implements Drawable
{
	public void Draw()
	{
		System.out.println("I am gonna draw Rectangle");
	}
}
public class Interface_Example_Two 
{
	public static void main(String [] args)
	{
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		c.Draw();
		r.Draw();
	}
}

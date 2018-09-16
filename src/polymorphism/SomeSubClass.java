package polymorphism;

public class SomeSubClass extends SomeSuperClass {
	public void print(String str)
	{
		super.print(str);
		System.out.println("From Sub class: "+ str);
	}
	private void show(int a, int b)
	{
		System.out.println("Got two inputs " + a + " and " + b);
	}
	private void show(int a)
	{
		System.out.println("Got one input " + a);
	}
}

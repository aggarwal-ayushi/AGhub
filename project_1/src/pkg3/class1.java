package pkg3;

public class class1 
{
	public class1()
	{
		this( 1, 2, 3);
		System.out.println("Parent Default");
	}
	public class1(int a)
	{
		this();
		System.out.println("parent one parametrized");
	}
	public class1(int a, int b)
	{
		this(10);
		System.out.println("parent two parametrized");
	}
	public class1(int a, int b,int c)
	{
		System.out.println("parent threee parametrized");
	
}
}


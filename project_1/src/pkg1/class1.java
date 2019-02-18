package pkg1;

public class class1 
{
	int age,rollno;
	public void display1()
	{
	   System.out.println("Welcome All");
	}
	public void display2()
	{
	   System.out.println("Welcome to all of you");
	}
	public static void main(String[] args)
	{
		class1 obj= new class1();
		obj.display1();
		obj.display2();
		obj.age=15;
		obj.rollno=12;
		System.out.println(obj.age);
        System.out.println(obj.rollno);		
	}

}

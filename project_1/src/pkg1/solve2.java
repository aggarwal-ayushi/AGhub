package pkg1;

public class solve2 
{
	public int sum(int a , int b)
	{
		int c;
		c = a +b;
		return c;
	}
	public int sub(int a , int b)
	{
		int c;
		c = a - b;
		return c;
	}
	public int mul(int a, int b)
	{
		int c;
		c= a*b;
		return c;
	}
	public void div(int a, int b)
	{
		int c;
		c= a/b;
		System.out.println("output is" + c);
	}
	public static void main(String[] args) {
		solve2 result = new solve2();
		int s1 = result.sum(10, 2);
		int s2 = result.sub(s1, 2);
		int s3 = result.sum(s2, 2);
		int s4 = result.mul(s3, 2);
        result.div(s4, 2);
	}
}
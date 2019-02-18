package polymorphism;

public class overloading {
	
	public int arithmetic(int a, int b)
	{
		int res =  a+b;
		return res;
	}
	public int arithmetic( int q, int w, int r)
	{
		int sol= q+w+r;
		return sol;
	}
	public static void main(String[] args) {
		overloading obj1 = new overloading();
		int res = obj1.arithmetic(5,7);
		System.out.println(res);
		overloading obj2 = new overloading();
		int result = obj2.arithmetic(5,7,3);
		System.out.println(result);
	}

}

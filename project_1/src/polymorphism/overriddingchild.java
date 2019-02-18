package polymorphism;

public class overriddingchild extends overriddingparent {
	
	public int arithmetic(int a, int b)
	{
		int sol =  a-b;
		
		super.arithmetic(6,3);
		return sol;
		
		
	}
	public static void main(String[] args) {
		overriddingchild obj = new overriddingchild();
		int sol = obj.arithmetic(4,2);
		System.out.println("child output is"+sol);
		
	}
	

}

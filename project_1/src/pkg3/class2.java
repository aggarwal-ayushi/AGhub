package pkg3;

public class class2 extends class1 {
	
	public class2() {
		super(1,2);
		System.out.println("child default");
	}
	public class2(int a) {
		this(2,12);
		System.out.println("child one parametrized");
	}
	public class2(int a, int b) {
	this();
		System.out.println("child two parametrized");
}
	public class2(int a, int b , int c) {
		this(2);
		System.out.println("child three parametrized");
	}
	public static void main(String[] args) {
		class2 obj = new class2(1,8,8);
	}
		
	}
	

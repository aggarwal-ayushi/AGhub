package staticuse;

public class staticvar {
	 static int a;
	  public static void method()
	  {
		  a=a+2;
		  System.out.println(a);
	  }
	  public static void method2()
	  {
		  a=a+3;
		  System.out.println(a);
	  }
	  public static void main(String[] args) {
		  staticvar StaticMethod = new staticvar();
		StaticMethod.method();
		  staticvar StaticMethod2 = new staticvar();
		StaticMethod2.method2();
	}

}

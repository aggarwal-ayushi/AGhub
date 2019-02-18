package staticuse;

public class nstaticvar {
	 int a;
	  public void method()
	  {
		  a=a+3;
				  System.out.println(a);
		  
	  }
	   public void method2()
	   {
		   a=a+2;
				   System.out.println(a);
	   }
     public static void main(String[] args) {
    	 nstaticvar obj = new nstaticvar();
    	 obj.method();
    	 nstaticvar obj2 = new nstaticvar();
    	 obj2.method2();
    	 obj2.method2();
    	 
		
	}
}

package pkg2;

public class case5 {
	public String name;
	double salary;
	case5(String ename){
		name =  ename;
	}
		public void printEmp() {
		      System.out.println("name  : " + name );
		      System.out.println("salary :" + salary);
		
		
		
		
	}
		public static void main(String[] args) {
			case5 t1 = new case5("ayushi");
		
			t1.salary=555;
			t1.printEmp();
			
			
		}
	
}

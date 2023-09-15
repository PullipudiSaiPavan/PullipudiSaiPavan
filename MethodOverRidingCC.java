package anotherpackage;

public class MethodOverRidingCC extends MethodOverRidingPC {
	@Override
	public void myMethod() {
		System.out.println("my method in child class");
		
	}
	@Override
	public void yourMethod() {
		System.out.println("your method in child class");
		
	}
  
	public static void main(String[] args) {
		MethodOverRidingCC obj=new MethodOverRidingCC();
		obj.myMethod();
		obj.yourMethod();
	

	}

}

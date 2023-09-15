package anotherpackage;

public class MethodOverLoading {
	public void first(long a) {
		System.out.println(a);
		
	}
    public void first(int a,String b) {
    	System.out.println(+a +b);
    }
    public void first(double a,double b) {
    	System.out.println("adding the doubles :" +(a+b));
    	
    }
	public static void main(String[] args) {
		
           MethodOverLoading obj=new MethodOverLoading();
           obj.first(987654321);
           obj.first(10,"Pavan");
           obj.first(25.5,24.5);
	}

}
package anotherpackage;

public class Encapsulation {
	private int age;
	private String name;
	
	
	public int getAge() {
		System.out.println("My age is  :"+age);
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		System.out.println("My name is :"+name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

package anotherpackage;

public abstract  class SampleAC implements Mobile {
	public  void processor() {
		System.out.println("processor must be in that mobile");
	}
	public void camera() {
		System.out.println("camera must be in that mobile");
	}
	public abstract void battery();
	public abstract void ram();
	public abstract void storage();

}

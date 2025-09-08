package sample;

public class  child extends Abstraction{

	@Override
	public void work() {
		System.out.println("working");
		
	}
	
	public static void main(String[] args) {
		child c= new child();
		c.m1();
		
		c.work();
	}

	
	

}

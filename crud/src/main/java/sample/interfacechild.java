package sample;

public class interfacechild implements Interface1,interface2 {

	@Override
	public void m1() {
		System.out.println("m1");
		
	}

	@Override
	public void m2() {
		System.out.println("m2");
		
	}

	@Override
	public void m3() {
		System.out.println("m3");
		
	}

	@Override
	public void m4() {
		System.out.println("m4");
	}
	
	
	public static void main(String[] args) {
		interfacechild obj = new interfacechild();
		//obj.m5();
		obj.m1();
		obj.m4();
	}

	@Override
	public void P1() {
		System.out.println("p1");
		
	}

	@Override
	public void p2() {
		System.out.println("p2");
		
	}

	@Override
	public void p3() {
		System.out.println("p3");
		
	}

}

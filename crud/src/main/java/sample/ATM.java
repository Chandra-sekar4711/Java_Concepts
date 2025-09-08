package sample;

public class ATM  {
	
	public void bank() throws sample.AgeException {
		
		sample.Bank b= new sample.Bank();
		int res = b.getbalance();//100
		System.out.println(res);
		  b.setbalance(200);
		  int res1 = b.getbalance();
		  System.out.println(res1);
		  
		  throw new sample.AgeException("its bank age exception");
	}

}

package sample;
import java.util.*;


public class Arrayylist {
	
	public static void main(String[] args) {
	
		Integer a[] =  new Integer[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=50;
		a[4]=100;
		System.out.println(Arrays.toString(a));

		List al1 = new ArrayList();
		for(Integer res:a)
		{
			al1.add(res);
		}
		System.out.println(al1);
		
		al1.add(1000);
		System.out.println(al1);
		
		System.out.println(al1.get(0));
		
		al1.set(4, 60);
		System.out.println(al1);
		
		al1.remove(5);
		System.out.println(al1);
		
		System.out.println(al1.indexOf(Integer.valueOf(60)));
		
		al1.remove(Integer.valueOf(60));
		System.out.println(al1);
		
		al1.add(3,40);
		System.out.println(al1);
		
		List al2 = new ArrayList();
		al2.add("chandra");
		al2.add("Sekar");
		
		System.out.println(al2);
		
		al1.addAll(5,al2);
		System.out.println(al1);
		
		al1.add(al2);
		System.out.println(al1);
		
		al1.removeAll(al2);
		System.out.println(al1);
		
	   al1.addAll(6,al2);
	   System.out.println(al1);
	   
	   System.out.println(al1.isEmpty());
	   
	   System.out.println(al1.size());
	   
	   System.out.println(al1.contains(al2));
	   
//	   al1.clear();
	   
	   System.out.println(al1);
	   
	   System.out.println(al1.equals(al2));
	   
	   List al3 = al1.subList(4, al1.size());
		System.out.println(al3);
		System.out.println("++++++++++++");
		
		Iterator i=al1.iterator();	
		while(i.hasNext())
		{
			if(i.next().equals(40))
			{
				i.remove();
			}
		}
		System.out.println(al1);
	}
}

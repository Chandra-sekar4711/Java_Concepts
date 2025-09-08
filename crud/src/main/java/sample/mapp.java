package sample;

import java.util.*;

public class mapp {
	
	public static void main(String[] args) {
		
		Map<Integer,String> hm = new HashMap();
		hm.put(1,"chandrasekar");
		hm.put(2, "Balaji");
		hm.put(3, "Rajasekar");
		hm.put(4, "nothing");
		hm.put(null, "vinoth");
		System.out.println(hm);
		
		
		System.out.println(hm.get(3));
		
		hm.replace(1, "chandrasekarperiyasami");
		System.out.println(hm);
		
		hm.remove(4);
		System.out.println(hm);
		
		Set s=hm.entrySet();
		System.out.println(s);
		 
		
		Set s1 = hm.keySet();
		System.out.println(s1);
	
		
	   Collection c =  hm.values();
	   System.out.println(c);
		
	       Iterator ii = s.iterator();	    
	       while(ii.hasNext())
	       {
	    	   Map.Entry<Integer, String> im = (Map.Entry<Integer, String>) ii.next();
	    	   if(im.getValue().equals("chandrasekarperiyasami"))
	    	   {
	    		   im.setValue("chandrasekar");
	    	   }
	    	   
	       }
	       
	       System.out.println(s);
	       
	       
	
	}

}

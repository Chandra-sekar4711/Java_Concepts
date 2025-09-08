package programs;

import java.util.*;

public class Numberprg {
  
	public static void main(String[] args) {
		 int count =1;
	    	
     String s = "aaabbbccccdd";
     char ch[] = s.toCharArray();  
     Arrays.sort(ch);
     for(int i=0;i<ch.length-1;i++)
     {
    	
    		 if(ch[i]==ch[i+1])
    		 {
    			 count=count+1;
    			 
    		 }
    		 else {
    			
    			 System.out.println(ch[i]+" "+"prints"+" "+count +" times");
    			 count=1;
    		 }
    	 
     }
     System.out.println(ch[ch.length-1] +" "+"prints"+" "+count +" times");
	}
}

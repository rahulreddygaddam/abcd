package com.gm.arraylist;


import java.util.LinkedHashMap;

public class Lhs {
	public static void main(String args[])
	{
		LinkedHashMap<Integer,String> ls=new LinkedHashMap<Integer,String>();
		{
			 
			ls.put(20, "sri");
			ls.put(45, "lath");
			ls.put(67, "rahul");
			ls.put(49, "eeshan");
		}
		 /*Iterator<Integer,String> it = () ls).iterator();
		    //System.out.println("print names");
		    {
		    	while(it.hasNext())	
		    	{
		    		System.out.println(it.next());
		    	}*/
		  
	 for(int x=1;x<ls.size(); x++)
	 {
		 System.out.println(ls.get(x)); 
	 }

	
	}
}


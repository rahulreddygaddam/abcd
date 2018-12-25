package com.gm.arraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class Array {
	
public static void main (String args[])
{
	ArrayList<String> list=new ArrayList<String>();
	list.add("Venus");
	 list.add("Earth");
	 list.add("JavaSoft");
	 list.add("Mars");
	 list.add("Jupiter");
	 list.add("Saturn");
	 list.add("Uranus");
	 list.add("--------");
	 
	 //list.remove("Earth");
	 //list.clear();
	 /*if(list.contains("Uranus") )
	 {
		 System.out.println("success");
	 }
	 else
	 {
		 System.out.println("fail"); 
	 }*/
	 list.contains("Mars");
	 System.out.println(list.subList(0, 3));
	 Iterator<String> itr = list.iterator();
	    
	    {
	    	while(itr.hasNext())	
	    	{
	    		System.out.println(itr.next());
	    	}
	  }
}
}
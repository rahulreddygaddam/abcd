package com.gm.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
 
public class list {
  public static void main(String args[]){
    ArrayList<String> names = new ArrayList<String>();
    names.add("Chaitanya");
    names.add("Steve");
    names.add("latha");
    names.add("latha");
    names.add("null");
    System.out.println(names.subList(1,2));
 System.out.println("rahul");

    Iterator<String> it = names.iterator();
    //System.out.println("print names");
    {
    	while(it.hasNext())	
    	{
    		System.out.println(it.next());
    	}
  }
}
}
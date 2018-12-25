package com.gm.arraylist;
import java.util.*;  
class Javaexample{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.add("sri");
  
      //displaying elements
     // System.out.println(alist);
  
      //Adding "Steve" at the fourth position
      //alist.add(3, "Steve");
      //alist.add(0, null);
 //alist.get(5);
     //alist.iterator();
      //displaying elements
      //alist.isEmpty();
      //System.out.println(alist.get(3));
 //System.out.println(alist.contains("latha"));
 /*if(alist.contains("latha"))
 {
 
 System.out.println("sucess");
 }
 else
 {
	 System.out.println("no"); */
 for(int x=3;x<alist.size(); x++)
 {
	 System.out.println(alist.get(x)); 
 }
 }
      
      
   }  

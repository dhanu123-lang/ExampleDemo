package com.velocity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {
	
	public static void main(String[] args) {
		
		String str = new String("Dhanshri");
	    System.out.println(str);	
	     
	    System.out.println("In Develop branch");
	  
	    List<String> al = new ArrayList<String>();
	    
	    al.add("Ram");
	    al.add("Shyam");
	    al.add("Meera");
	    al.add("Sai");
	    System.out.println("List is >> "+al);
	    
	    Iterator<String> itr = al.iterator();
	    
	    while(itr.hasNext())
	    {
	      System.out.println(itr.next());
	    }
	}

}

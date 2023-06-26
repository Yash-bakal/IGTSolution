package com;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;
import java.util.List;

public class Demo1 {
    public static void main(String args[])
    {
    	//List l = new List();
    	//hetrogenious values
    	//Size is not fixed
    	
    	ArrayList a1 = new ArrayList<>(4);
    	a1.add(100);
    	a1.add(200);
    	a1.add("ABC");
    	a1.add(true);
    	a1.add(new Date());
    	a1.add(600);
    	
    	Iterator i = a1.iterator();
    	while(i.hasNext())
    	{
    		System.out.println(i.next());
    	}
    	
    	System.out.println("=========================");
    	System.out.println(a1.contains(100));
    	System.out.println(a1.size());
    	System.out.println(a1.isEmpty());
    	System.out.println(a1.remove(0));
    	System.out.println(a1);
    // System.out.println(a1.clear();
    	
    }
	
}

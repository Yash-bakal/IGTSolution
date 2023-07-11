package com;

import java.util.*;
public class Demo3 {

	public static void main(String[] args) {
		
    //   HashSet al = new HashSet(); // No duplicate + unordered
	//	LinkedHashSet al = new LinkedHashSet();//No duplicate + user defined order
	     TreeSet al = new TreeSet();	
		
		al.add(100);
		al.add(200);
		al.add(200);
		al.add(700);
		al.add(400);
		al.add(500);
		al.add(600);
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}

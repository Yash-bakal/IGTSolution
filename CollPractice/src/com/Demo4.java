package com;

import java.util.*;
public class Demo4 {

	public static void main(String[] args) {
		
		//HashMap al = new HashMap();\
		//LinkedHashMap al = new LinkedHashMap();
		TreeMap al = new TreeMap();
		
		al.put(100,"ABC");
		al.put(200,"Suresh");
		al.put(400,"RAM");
		al.put(500,"Kunal");
		al.put(200,"Ramesh");

		Set s = al.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
	}

}

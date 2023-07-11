package com;

import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		

	}

}

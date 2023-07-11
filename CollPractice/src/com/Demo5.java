package com;

import java.util.*;
import java.io.*;
 class A{
	
	int id;
	String name;
	String desig;
	Scanner sc = new Scanner(System.in);
	
	A(){
	System.out.println("Enter id : ");
	id = sc.nextInt();

	System.out.println("Enter name : ");
	name = sc.next();
	
	System.out.println("Enter desig : ");
	desig = sc.next();
	}
	
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(desig);
	}	
}
public class Demo5 {
	public static void main(String[] args) {
		ArrayList<A> al= new ArrayList<>();		
		al.add(new A());
		Iterator i = al.iterator();
		while(i.hasNext()) {
			A x = (A) i.next();
			x.display();		
		}
	}
}

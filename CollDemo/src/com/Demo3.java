package com;

import java.util.*;

 
public class Demo3 {
 
    public static void main(String[] args) {
    // List  : will allow the duplicates
    	
    	//  ArrayList al = new ArrayList<>();
       // LinkedList al= new LinkedList();
        //Vector al = new Vector<>(); legacy class : old class : 1995 , limeted methods 
        //Stack al = new Stack<>();
    		
     //SET
   //HashSet al= new HashSet<>(); //no duplicate
   //LinkedHashSet al = new LinkedHashSet<>(); //no duplicates + user entered order
   TreeSet al =new TreeSet();//no dup+ sorted order
   
    	al.add(100);
        al.add(100);
    	al.add(200);
        al.add(200);
    	al.add(700);
        al.add(450);
    	al.add(987);
        al.add(600);      
      //  al.add("Abc");
      //  al.add("XYZ");
      //  al.add("LMN");
      //  al.add("DEF");

     Iterator i=al.iterator(); 
     while(i.hasNext()) {
         System.out.println(i.next());
     }
    }
 
}

//LIST                             SET
//==========================================================================
// Duplicate               not duplicate value
//maintain the
//order                    hashset: no order
//                         Linked hashset:no duplicate+ user enteredd order
//                         TreeSet : no dup + sorted order



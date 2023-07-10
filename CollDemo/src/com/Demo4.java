package com;

import java.util.*;

public class Demo4 {
   public static void main(String args[])
   {
	  //LIST
	  //SET
	 // SET + LIST= Map
	   
	   //HashSet al = New HashSet<>();//no duplicates 
	   //LinkedHashSet al = new LinkedHashSet<>();//no duplicate+ user entered order
	   //TreeSet al = new TreeSet(); //no dup+ sorted order
//HashMap map = new HashMap<>();//no duplicate	   
//LinkedHashMap map = new LinkedHashMap<>();//no dup + user entered order	   
  TreeMap map = new TreeMap<>();//no dup + sorted
  
  map.put(111,"Suresh");
  map.put(555,"Ramesh");
  map.put(666,"Abhi");
  map.put(234,"Chandan");
  map.put(777,"Pratha");
  map.put(666,"Mavith");
  
 Set s = map.entrySet();//using for no duplicate
 
 Iterator i = s.iterator(); 
 while(i.hasNext()) {
     System.out.println(i.next());
   }
}
}

package com;

public class Student {
 private int sid;
 private String sname;
 private int smark;
 private String ssection;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getSmark() {
	return smark;
}
public void setSmark(int smark) {
	this.smark = smark;
}
public String getSsection() {
	return ssection;
}
public void setSsection(String ssection) {
	this.ssection = ssection;
}
public void display() {
	System.out.println(sid+" "+sname+" "+smark+" "+ssection);
	
}
}

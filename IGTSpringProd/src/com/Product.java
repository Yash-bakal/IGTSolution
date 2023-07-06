package com;

 

public class Product {

    private int pid;
    private String pname;
    private int price;
    private String pdesc;

    public Product(int pid, String pname, int price, String pdesc) {
        super();
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.pdesc = pdesc;
    }

 

    void display() {
        System.out.println(pid + " " + pname + " " + price + " " + pdesc);
    }
}
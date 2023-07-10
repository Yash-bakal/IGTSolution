package JAVA8Feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}
public class Demo6 {

	public static void main(String[] args) {
		ArrayList<Product> prod = new ArrayList<Product>();
		prod.add(new Product(100,"Nokia",50000));
		prod.add(new Product(500,"OPPO",20000));
		prod.add(new Product(300,"Samsung",30000));
		prod.add(new Product(200,"MI",40000));
		prod.add(new Product(600,"IPhone",50000));

		for (Product product:prod) {
			if(product.price<40000) {
				System.out.println(product.id +" :"+product.name+" :"+product.price);
			}
		}
		System.out.println("===================================================");
         List myproducts = prod.stream()
         .filter(p->p.price<50000)
         .map(p->p.price)
         .limit(3)
         .collect(Collectors.toList());
         
         System.out.println(myproducts);
         
         	
		
	}

}

package JAVA8Feature;

interface X
{
	void add();	
}

interface Cal
{	 
	int mul(int a, int b);
 }


public class Demo1LambdaExpression {

	public static void main(String[] args) {
		X x = new X() {
			public void add() {
				System.out.println("Hi Demo");
			}
		};
       x.add();
       System.out.println("=============================");
       X x1=()->{
    	   System.out.println("Hi Lamda");
       };
       x1.add();
       System.out.println("=========parameter====================");
        
       Cal x2=(int a,int b)->a*b;
		System.out.println(x2.mul(20,20));

	}

}

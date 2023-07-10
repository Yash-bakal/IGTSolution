package JAVA8Feature;

interface Bank{
	void loan();
	default void OT() {
		System.out.println("Hi OT method");
	}
	static void Withdraw() {
		System.out.println("Hi Withdraw method");
	}
}
class Sbi implements Bank{
	
	@Override
	public void loan() {
		
	}
}
class Axix implements Bank{
	@Override
	public void loan() {
		
	}
}
public class Demo4 {

	public static void main(String[] args) {
		Sbi s = new Sbi();
		s.OT();//IF default we have to create obj
		Bank.Withdraw();//no need of obj
	}

}

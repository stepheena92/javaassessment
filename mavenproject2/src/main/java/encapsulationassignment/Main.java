package encapsulationassignment;

public class Main {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		User u=new User(b,1901);
		b.validatePin();

	}

}

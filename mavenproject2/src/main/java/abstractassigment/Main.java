package abstractassigment;

public class Main {

	public static void main(String[] args) {
		Contractor c=new Contractor(25,9);
		c.calculateSalary();
		FullTimeEmployee f=new FullTimeEmployee(50);
		f.calculateSalary();

	}

}

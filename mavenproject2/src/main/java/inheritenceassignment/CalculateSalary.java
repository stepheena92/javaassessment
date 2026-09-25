package inheritenceassignment;

public class CalculateSalary extends Employee {
	double hra;
	double pf;
	public void calculate() {
		hra=basicPay*5/100;
		pf=basicPay*20/100;
	}

}

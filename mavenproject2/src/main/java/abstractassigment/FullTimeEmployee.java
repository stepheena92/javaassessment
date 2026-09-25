package abstractassigment;

class FullTimeEmployee extends Employee {
	int paymentPerHour;
	FullTimeEmployee(int paymentPerHour){
		this.paymentPerHour=paymentPerHour;
	}
	void calculateSalary() {
		int salary = paymentPerHour*8;
		System.out.println("Salary of Fulltime Employee: "+salary);
	}

}

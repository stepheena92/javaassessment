package inheritenceassignment;

public class SalarySlip extends CalculateSalary {
	
	public void totalSalary() {
		double totalSalary=basicPay+hra-pf-deduction+bonus;
		System.out.println("\n      ......SALARY SLIP.......\n");
		System.out.println("BasicPay    Deduction     hra       pf           Bonus     TotalSalary");
		System.out.println(basicPay+"     "+deduction+"      "+hra+"     "+pf+"      "+bonus+"     "+totalSalary);
		
	}
	

}

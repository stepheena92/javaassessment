package interfaceassignment;

public class HDFC implements RBI {
	double amount;
	double duration;
	HDFC(double amount,double duration){
		this.amount=amount;
		this.duration=duration;
	}
	public void recurringDeposit() {
		double interest=(amount*duration*interestRate)/100;
		double totalAmount=amount+interest;
		System.out.println("Interest after duration period: "+interest);
		System.out.println("TotalAmount after duration: "+totalAmount);
	}

}

package encapsulationassignment;

public class Bank {
	private int pinNo;
	public void setPin(int pinNo) {
		this.pinNo=pinNo;
	}
	public void validatePin() {
		if(pinNo==1001 ||pinNo==1234 ||pinNo==1212) {
			System.out.println("Pin is Valid");
		}else {
			System.out.println("Invalid Pin...TryAgain!!!");
		}
			
	}

}

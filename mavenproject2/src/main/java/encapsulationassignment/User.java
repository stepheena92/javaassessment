package encapsulationassignment;

public class User extends Bank{
	
	public User(Bank b,int userPin) {
		b.setPin(userPin);
	}

}

package superassignment;

public class IsDivisible extends Addition{
	int add=super.add() ;
	public void isDivisibleby10() {
		if(add%10==0) {
			System.out.println(add+"is divisible by 10");
		}else {
			System.out.println(add+"is not divisible by 10");
		}
	}

}

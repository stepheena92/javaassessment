package polymorhismassigment;

public class OnSeason extends OffSeason {
	void discount(double price) {
		double discount= price*40/100;
		double totalAmt=price-discount;
		System.out.println("discount at onseason: "+discount);
		System.out.println("Total price after discount= "+totalAmt);
		
	}


}

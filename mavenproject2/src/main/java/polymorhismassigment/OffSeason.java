package polymorhismassigment;

public class OffSeason  {
	void discount(double price) {
		double discount= price*15/100;
		double totalAmt=price-discount;
		System.out.println("discount at offseason: "+discount);
		System.out.println("Total price after discount= "+totalAmt);
		
	}

}

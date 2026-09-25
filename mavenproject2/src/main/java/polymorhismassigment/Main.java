package polymorhismassigment;

public class Main {

	public static void main(String[] args) {
		OffSeason cu1=new OffSeason();
		cu1.discount(5000);
		cu1=new OnSeason();
		cu1.discount(8000);

	}

}

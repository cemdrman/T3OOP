package hafta4;

public class Kedi extends Hayvan {

	@Override
	public void sesCikar() {
		System.out.println("Miav-Miav");
		super.sesCikar();
	}
	
	public void fareYakala() {
		System.out.println("Fare yakalandı!");
	}

}

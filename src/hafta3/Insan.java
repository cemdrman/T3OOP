package hafta3;

public class Insan {

	private String gozRengi;
	 static final String sacRengi = "Sarı";
	private int yas;

	public void nefesAl() {
		System.out.println("nefes alınıyor...");
	}

	public String getGozRengi() {
		return gozRengi;
	}

	public void setGozRengi(String gozRengi) {
		this.gozRengi = gozRengi;
	}

	public String getSacRengi() {
		return sacRengi;
	}

	public void setSacRengi(String sacRengi) {
		//this.sacRengi = sacRengi;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

}

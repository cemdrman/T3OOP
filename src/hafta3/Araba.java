package hafta3;

public class Araba {

	private String marka;
	private String model;
	private int uretimYili;
	private String renk;
	static int hiz;
	private int maxHiz;

	public Araba() {

	}

	public Araba(String marka, String model, int uretimYili) {
		this.marka = marka;
		this.model = model;
		this.uretimYili = uretimYili;
	}

	// overload method
	public void hizlan() {
		hiz += 10;
	}

	public void hizlan(int verilenHiz) {
		hiz += verilenHiz;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		if (3 < 5) {
			this.marka = marka;
		}

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getUretimYili() {
		return uretimYili;
	}

	public void setUretimYili(int uretimYili) {
		this.uretimYili = uretimYili;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMaxHiz() {
		return maxHiz;
	}

	public void setMaxHiz(int maxHiz) {
		this.maxHiz = maxHiz;
	}

}

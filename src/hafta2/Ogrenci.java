package hafta2;

public class Ogrenci {

	private String isim;
	private String soyisim;
	private int yas;
	private int okulNo;

	public Ogrenci() {
	}

	public Ogrenci(String isim, String soyisim) {
		this.isim = isim;
		this.soyisim = soyisim;
	}

	public Ogrenci(String isim, String soyisim, int yas, int okulNo) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.yas = yas;
		this.okulNo = okulNo;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getOkulNo() {
		return okulNo;
	}

	public void setOkulNo(int okulNo) {
		this.okulNo = okulNo;
	}

}

package hatta2;

public class Main {

	public static void main(String[] args) {
		String isimSoyisim;
		String isim = "cem";
		String soyisim = "dirman";
		isimSoyisim = isim.concat(soyisim);
		System.out.println(isimSoyisim);
		// ---OOP
		Araba audi = new Araba();// instace(örnek) oluşturma
		audi.setMarka("Audi");
		audi.setModel("A8");
		audi.setUretimYili(2019);

		Araba bmw = new Araba();
		bmw.setMarka("BMW");
		audi.hizlan(50);
		bmw.setRenk("Siyah");
		bmw.setModel("520D");
		bmw.hizlan();
		bmw.hizlan(50);

		System.out.println("marka:" + bmw.getMarka() + " hiz: " + bmw.hiz);
		System.out.println("hiz: " + audi.hiz + "maxHiz:" + audi.getMaxHiz());

		Araba hyundai = new Araba();
		hyundai.setMarka("hyundai");

		Araba a = new Araba("marka", "model", 2019);
		System.out.println(a.getMarka());
		
		
		//-----
		
		Ogrenci[] ogrenciList = new Ogrenci[3]; // Ogrenci tipinde array. Array tanımında kaç elemanlı olması gerektiğini vermemiz gerek. 
		
		Ogrenci o1 = new Ogrenci();
		o1.setIsim("cem");
		o1.setSoyisim("dırman");
		o1.setYas(18);
		
		ogrenciList[0] = o1;
		
		Ogrenci o2 = new Ogrenci("Ömer", "koçbil");
		ogrenciList[1] = o2;
		
		Ogrenci o3 = new Ogrenci("Emir", "Al", 3, 25);
		ogrenciList[2] = o3;
		
		
		for (int i = 0; i < ogrenciList.length; i++) {
			System.out.println(ogrenciList[i].getIsim());
		}
	}

}

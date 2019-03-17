package hafta3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Bebek b1 = new Bebek();
		// Bebek.sacRengi = "Siyah";
		System.out.println(Bebek.sacRengi);
		// b1.setGozRengi("kahverengi");
		b1.nefesAl();
		// Insan i1 = new Insan(); şuan Insan bir interface ve interface bir
		// soyut class olduğu icin soyut class'dan bir nesne oluşturamazsınız.
		// i1.nefesAl();
		Object o = new Object();
		// b1.setGozRengi("mavi");
		// -----------

		Araba araba = new Araba();
		araba.hiz = 150;
		Araba.hiz = 200;

		System.out.println(araba.hiz);

		araba.hizlan(250);
		System.out.println(araba.hiz);
		Araba araba2 = new Araba();
		araba2.hizlan();
		System.out.println(araba2.hiz);
		System.out.println(araba.hiz);
		System.out.println(Araba.hiz);
		// -----

		int[] numberList = { 1, 4, 7, 9 };
		int[] list = new int[10];
		list[0] = 5;
		int b = list[0];

		ArrayList<String> isimListe = new ArrayList<>();
		isimListe.add("cem");
		isimListe.add("emir");

		ArrayList<Integer> liste1 = new ArrayList<>();
		String isim1 = isimListe.get(0);

		for (int i = 0; i < isimListe.size(); i++) {
			System.out.println(isimListe.get(i));
		}

		Map<Integer, String> map = new HashMap();
		map.put(1, "b");
		map.put(2, "c");
		String c = map.get(1);
		System.out.println(c);

		Set<String> set = new HashSet();
		set.add("cem");
		set.add("akif");
		set.add("bahadır");

		System.out.println(set.contains("cem".contains("e")));
		System.out.println("cem".contains("e"));

		// interface

		Cocuk cocuk = new Cocuk();

	}

}
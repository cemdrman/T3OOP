package hafta1;

public class Ders1 {

	public static void main(String[] args) {
		int a = 20;
		int b = 2;
		tamBölünüyorMu(20, 2);
		int[] list = { 1, -2, 4, 0, 7, 5, 45, -500 };
		int tamBölünenSayisi = tamBölünüyorMu(list, 3);

		int[] sonuc = bul(list);
		for (int i = 0; i < sonuc.length; i++) {
			System.out.println(sonuc[i]);
		}

	}

	static boolean tamBölünüyorMu(int bölünen, int bölen) {
		return bölünen % bölen == 0;
	}

	static int tamBölünüyorMu(int[] sayiList, int bölen) {
		int uzunluk = sayiList.length;
		int sayac = 0;
		for (int i = 0; i < uzunluk; i++) {
			if (sayiList[i] % bölen == 0) {
				sayac++;
			}
		}
		return sayac;
	}

	static int[] enKucukVeEnBuyuk(int[] list) {
		int[] arr = new int[2];
		int enBuyuk = 0;
		int enKucuk = 0;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (list[i] > list[j]) {
					enBuyuk = list[i];
				}
				if (list[i] < list[j]) {
					enKucuk = list[i];
				}
			}
		}
		arr[0] = enBuyuk;
		arr[1] = enKucuk;
		return arr;
	}

	static int[] bul(int[] list) {
		int[] arr = new int[2];
		int enBuyuk = list[0];
		int enKucuk = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] > enBuyuk) {
				enBuyuk = list[i];
			}
			if (list[i] < enKucuk) {
				enKucuk = list[i];
			}

		}
		arr[0] = enBuyuk;
		arr[1] = enKucuk;
		return arr;
	}

}

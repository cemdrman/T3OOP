package hafta4;

import java.lang.reflect.Method;
import java.sql.Date;
import hafta3.Bebek;
import hafta3.*;

public class Main {

	public static void main(String[] args) {

		Method m;
		Integer i;
		Date s = new Date(23443334456L);

		java.util.Date s1 = new Date(23443334456L);

		Bebek b = new Bebek();
		Cocuk c = new Cocuk();

		Kedi k1 = new Kedi();
		k1.fareYakala();

		k1.sesCikar();
		((Hayvan) k1).sesCikar();

		Hayvan h1 = new Hayvan();
		h1.sesCikar();

		Hayvan a = new Kedi();
		((Kedi) a).fareYakala();

		a.sesCikar();

	}

}

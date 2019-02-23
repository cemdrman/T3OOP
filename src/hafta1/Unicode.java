package hafta1;

public class Unicode {

	public static void main(String[] args) {
		
		for (int i = 0; i < 20000; i++) {
			System.out.print((char)i + "\t");
			if (i % 20 == 0) {
				System.out.println();	
			}
		}
	}

}


public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
		int aranacak = 5;
		
		for(int i = 0; i < sayilar.length; i++) {
			if(aranacak == sayilar[i]) {
				System.out.println("Aradığınız sayı bulundu ve indeks numarası: " + i);
			}
			
		}
		
	}

}


public class Main {

	public static void main(String[] args) {
		
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Trabzon";
		sehirler[2][1] = "Giresun";
		sehirler[2][2] = "Ordu";
		
		for(int i = 0; i < sehirler.length; i++) {
			System.out.println("------------");
			
			for(int j = 0; j < sehirler[0].length; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

	}

}

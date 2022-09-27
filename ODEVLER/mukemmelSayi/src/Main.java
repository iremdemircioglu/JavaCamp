
public class Main {

	public static void main(String[] args) {
		
		int number = 28;
		int mukemmel = 0;
		
		for(int i = 1; i < number; i++) {
			int remain = number % i;
			
			if (remain == 0) {
				mukemmel = i + mukemmel;
			}
		}
		if (mukemmel == number) {
			System.out.println("Mükemmel bir sayıdır");
		}
		else {
			System.out.println("Mükemmel bir sayı değildir");
		}
	}

}

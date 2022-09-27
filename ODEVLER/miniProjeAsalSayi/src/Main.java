
public class Main {

	public static void main(String[] args) {
		
		int number =74;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;
		
		/* MY SOLUTION
		for(int i = 2; i < number; i++) {
			int remain = number % i;
			
			if(remain == 0) {
				System.out.println(number +" asal sayı değildir");
				break;
			}
			if(remain != 0 && i == number - 1) {
				System.out.println(number + " asal sayıdır");
			}
		}
		*/
		
		if(number == 1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		
	    if (number < 2) {
	    	System.out.println("Geçersiz sayı");
	    	return;
	    }
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}	
		if (isPrime) {
			System.out.println("Sayı asaldır");
		}
		else {
			System.out.println("Sayı asal değildir");
		}
		
		
		

	}

}

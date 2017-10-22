/**
 *  Create by Andres Gonzalez 2017/10/18
 */
public class ForLoop {

	public static void main(String[] args) {
		double amount = 10_000;
		for (int i = 2; i <= 8; i++) {
			System.out.println("10,000 at "+ i +"% interest = " + String.format("%.2f", calculateInterest(amount, i)));
		}
		
		System.out.println();
		
		for (int i = 8; i >= 2; i--) {
			System.out.println("10,000 at "+ i +"% interest = " + String.format("%.2f", calculateInterest(amount, i)));
		}

		int count = 0;
		for (int j = 1; j < 30; j++) {
			if (isPrime(j)) {
				System.out.println("Number " + j + " is a prime number");
				count ++;
				if (count == 3) {
					break;
				}
			}
		}
	}
	
	public static double calculateInterest(double amount, double interesRate) {
		return amount * (interesRate/100);
	}
	
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		
		for (int i=2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}

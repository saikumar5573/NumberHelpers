package basicNumbers;

public class Primes {
	public static void printPrimeNumbers(int x,int y) {
		
		for (int a=x;a<=y;a++) {
			int count=0;
			
			for(int i=2;i<=a/2;i++) {
				if(a%i==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(a);
			}
		}
	}
	
	public static void main(String[]args) {
	    Primes.printPrimeNumbers(3, 100);
	}
}

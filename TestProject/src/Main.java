import java.util.*;


public class Main {

	public static void main(String args[]) {
		
		System.out.println("This program will find the greatest common factor between two integers.");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter the First Integer: ");
		int n1 = input.nextInt();
		System.out.println("Please Enter the Second Integer: ");
		int n2 = input.nextInt();
		
		input.close();
		
		//Make the larger number stored in a
		int a, b;
		if(n1 > n2) {
			a = n1; b = n2;
		} else {
			b = n1; a = n2;
		}
		int greatestFactor;
		
		//If b is prime, it cannot be factored
		if(isPrime(b))
			if(a % b == 0)
				greatestFactor = b;
			else {
				System.out.println("The Greatest Common Factor between " + n1 + " and " + n2 + " is " + 1);
				return;
			}
		
		//Find GCD
		greatestFactor = gcd(a, b);
		
		System.out.println("The greatest Common Factor between "+ n1 + " and " + n2 + " is " + greatestFactor);
		
		
	}
	
	//Recursive function
	private static int gcd(int a, int b)
	{
		if(b == 0)
			return a;
		return
			gcd(b, a % b);
	}
	
	private static boolean isPrime(int n)
	{
	    if(n < 2) return false;
	    if(n == 2 || n == 3) return true;
	    if(n%2 == 0 || n%3 == 0) return false;
	    long sqrtN = (long)Math.sqrt(n)+1;
	    for(long i = 6L; i <= sqrtN; i += 6) {
	        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
	    }
	    return true;
	}
}

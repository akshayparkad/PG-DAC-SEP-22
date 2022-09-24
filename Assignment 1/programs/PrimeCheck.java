import java.util.Scanner;

class PrimeCheck {

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		int nonPrimeCount=0;
		
		if(num <= 1){
			nonPrimeCount++;
		}
		
		for(int i=2; i<=num/2; i++){
			if(num%i == 0){
			nonPrimeCount++;
			}

		}
		
		if(nonPrimeCount > 0){
			
			System.out.println(num + " is not a prime number");
		
		} else {
			
			System.out.println(num + " is a prime number");
		}
		
		}
	
}
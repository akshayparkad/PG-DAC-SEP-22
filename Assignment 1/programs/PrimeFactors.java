import java.util.Scanner;

class PrimeFactors{

 public static void main(String args[]){
 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number");
	int num = sc.nextInt();
	
	int i = 2;
	
	while(num > 1){
	
		if(num % i == 0) {
			System.out.println(i + "");
			num = num/i;
		} else {
			i++;
		}
	}
		
	}
	
}
	
	
	
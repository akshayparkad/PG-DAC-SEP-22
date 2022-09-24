import java.util.Scanner;

class Digits {

	public static void main(String[] args){
	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		//int tempNum = num;
		
		int reverse = 0;
		
		
		
		while(num != 0){
		
		int rem = num % 10;
		
		reverse = reverse * 10 + rem;
		
		
		num = num /10;
		
		}
		
		while(reverse != 0){
			
			int rem = reverse % 10;
			
			System.out.print(rem + ", ");
			
			reverse = reverse / 10;
		
		}
		
	
	}
	
}
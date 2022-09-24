import java.util.Scanner;

class Palindrome {

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		int reverse = 0;
		int tempNum = num;
		
		while(num>0){
		
		int remainder = num % 10;
		
		reverse = reverse*10 + remainder;
	
		num = num / 10;
		
		}
		
		if(reverse == tempNum) {
		
		System.out.println("Given number is Palindrome");
		} else {
		System.out.println("Given number is not Palindrome");
		}
		
	}

}
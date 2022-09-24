import java.util.Scanner;

class FactorialR {

	public static void main(String[] args){
	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		System.out.println(FactorialRecursion(num));
	
		}
				
	public static int FactorialRecursion(int num){
		
			if(num < 0){
				
				return 0;
				
			}
			
			if(num == 0){
			
				return 1;
			}
			
			return (num*FactorialRecursion(num-1));
	
	}
		
	}
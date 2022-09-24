import java.util.Scanner;

class Pattern28{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number of rows: ");
	int num = sc.nextInt();
	
	for(int i=1; i<=num; i++){
		
		for(int j=1; j<=i; j++){
			
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	for(int i=num-1; i>=1; i--){ //num-1 to remove duplicate row
		
		for(int j=i; j>=1; j--){
			
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	
	
	
	}

}
import java.util.Scanner;

class Pattern27{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number of rows: ");
	int num = sc.nextInt();
	
	for(int i=1; i<=num; i++){
		
		for(int j=num -1; j >= i; j--){ //Space
			
			System.out.print(" ");
		}
		
		for(int j=2; j<=i; j++){ //extra star
			
			System.out.print("*");
		}
		
		for(int j=i; j>=1; j--){ //Col
			
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	for(int i=num-1; i>=1; i--){ //num-1 will remove the duplicate line in second triangle
		
		for(int j=num -1; j >= i; j--){ //Space
			
			System.out.print(" ");
		}
		
		for(int j=2; j<=i; j++){ //extra star
			
			System.out.print("*");
		}
		
		for(int j=i; j>=1; j--){ //Col
			
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	}


}
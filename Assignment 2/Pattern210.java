import java.util.Scanner;

class Pattern210{

public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number of rows: ");
	int num = sc.nextInt();
	
	for(int i=1; i<=num; i++){
		
		for(int j=num-1; j>=i; j--){ //space
			System.out.print(" ");
		}
		
		for(int j=1; j<=num; j++){
			
			System.out.print("*");
		}
		
		System.out.println();
	}
		
	}
	
}
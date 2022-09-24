import java.util.Scanner;

class Pattern26{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number of rows: ");
	int num = sc.nextInt();
	
	for(int i=num; i>=1; i--){ //row
	
		
		for(int j=num-1; j>=i; j--){  //Space
		
			System.out.print(" ");
			
		}
		
		for(int j=2; j<=i; j++){ //extra star
			
			System.out.print("*");
		}
		
		for(int j=i; j>=1; j--){ //col

			
			System.out.print("*");
		}
		
		
		System.out.println();
	}
	
	}


}
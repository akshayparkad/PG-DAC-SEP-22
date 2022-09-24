import java.util.Scanner;

class Pattern212{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number of rows: ");
	int num = sc.nextInt();
	
	for(int i=num; i>=1; i--){
		
		for(int j=i; j>=1; j--){
			
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	for(int i=1; i<=num; i++){
		
		for(int j=i; j>=1; j--){
			
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	}


}
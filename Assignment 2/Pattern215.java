import java.util.Scanner;

class Pattern215{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number of rows: ");
	int num = sc.nextInt();
	
	for(int i=1; i<=num; i++){
		
		for(int j=1; j<=i; j++){
			
			if(i == j || j == 1 || i == num){
				
				System.out.print("*");
				
			} else {
			
			System.out.print(" ");
			}
		}
		
		System.out.println();
	}
	
	}


}
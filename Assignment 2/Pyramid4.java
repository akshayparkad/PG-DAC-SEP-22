import java.util.Scanner;

class Pyramid4{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++){
		
			
			for(int j=num-1; j>=i; j--){
			
				System.out.print("  ");
			
			}
			
			for(int j=1; j<=i; j++) {
			
				System.out.print(j + " ");
			
			}
			
				
			for(int j=i-1; j>=1; j--){

				System.out.print(j + " "); //extra triangle
			}
		
			
				System.out.println();
			
		}
		
	}
		

}
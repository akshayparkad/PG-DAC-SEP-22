import java.util.Scanner;

class Pattern10{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		
		int letter = 64;
		
		for(int i=1; i<=num; i++){
			
			for(int j=num-1; j>=i; j--){
				
				System.out.print(" ");
			}
			
				for(int j=num-i+1; j<=num; j++){
					
					System.out.print((char)(j + letter) + " ");
				}
			
			System.out.println();
		}

	}

}
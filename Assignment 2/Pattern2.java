import java.util.Scanner;

class Pattern2{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		int letter = 64;
		for(int i=1; i<=num; i++){
			
			for(int j=1; j<=i; j++){
				
				System.out.print((char)(j + letter));
			}
			
			System.out.println();
		}

	}


}
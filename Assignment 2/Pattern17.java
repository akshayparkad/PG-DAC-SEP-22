import java.util.Scanner;

class Pattern17{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int i=1; i<=num; i++){
			
			for(int j=1; j<=i; j++){
				
				count++;
				
				System.out.print(count + " ");
			}
			
			System.out.println();
		}

	}

}
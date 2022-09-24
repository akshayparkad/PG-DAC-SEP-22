import java.util.Scanner;

class Smallest{

 public static void main(String[] args){
 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number a: ");
	int a = sc.nextInt();
	
	System.out.println("Enter Number b:" );
	int b = sc.nextInt();
	
	System.out.println("Enter Number c:" );
	int c = sc.nextInt();
	
	int check =  a < b ? a : b;
	
	int smallestNumber = c < check ? c : check;
	
	System.out.println("Smallest number is " + smallestNumber);
	
	}
	
}
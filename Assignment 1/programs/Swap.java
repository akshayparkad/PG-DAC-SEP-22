import java.util.Scanner;

class Swap{

 public static void main(String[] args){
 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number a: ");
	int a = sc.nextInt();
	System.out.println("Enter Number b:" );
	int b = sc.nextInt();
	
	a = a + b;
	b = a - b;
	a = a - b;
	
	System.out.println("Value of a is " + a + " and value of b is " + b);
	
	}
}

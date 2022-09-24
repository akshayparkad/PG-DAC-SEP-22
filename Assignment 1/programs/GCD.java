import java.util.Scanner;

class GCD{

 public static void main(String[] args){
 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number a: ");
	int a = sc.nextInt();
	
	System.out.println("Enter Number b:" );
	int b = sc.nextInt();
	
	
	while(a != b){
	
	if(a > b){
	
	a  = a - b;
	
	} else {
	
	b = b - a;
	
	}
	
	
	}
	System.out.println("GCD of a given numbers is: " + b);
	
	}
	
	
}
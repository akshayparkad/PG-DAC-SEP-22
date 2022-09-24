import java.util.Scanner;

class LCM{

 public static void main(String[] args){
 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number a: ");
	int a = sc.nextInt();
	
	System.out.println("Enter Number b:" );
	int b = sc.nextInt();
		
	int tempa =a;
	int tempb =b;
	
	while(a != b){
	
	if(a > b){
	
	a  = a - b;
	
	} else {
	
	b = b - a;
	
	}
	
	}
	
	int LCM = tempa*tempb / b;
	
	System.out.println("LCM is: " + LCM);
	
	}
	
	
}
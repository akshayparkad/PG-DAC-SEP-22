import java.util.Scanner;

class AddWithout{

 public static void main(String[] args){
 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Number a: ");
	int a = sc.nextInt();
	
	System.out.println("Enter Number b:" );
	int b = sc.nextInt();
	
	if( b < 0) {
		
		for(int i=b; i<0; i++){
	
		a--;
	}
		
	} 
	
	else{
		
	for(int i=1; i<=b; i++){
	
		a++;
	}
	
	}
	
	System.out.println("Addition: " + a);
	}
	
}
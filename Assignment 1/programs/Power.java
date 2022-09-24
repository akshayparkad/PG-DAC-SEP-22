
public class Power{
    public static void main (String[] args){
       
		int base = 14;
		int power = 5;
		int sol = 1;
		int count=0;

		while(count < power){
			
			sol = sol*base;
			count++;
			
		}
		
		System.out.println(sol);

}

}
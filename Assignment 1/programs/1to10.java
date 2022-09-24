class 1to10{

	public static void main(String[] args){
	
	printNumbers(printNumbers(1));
	
	}
	
	public static int printNumbers(n){
		
		if(n > 10){
			break;
		}
		
		return n+1;
	
	}
	
	}
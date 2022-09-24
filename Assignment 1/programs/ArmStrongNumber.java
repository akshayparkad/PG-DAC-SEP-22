import java.util.Scanner;

public class ArmStrongNumber{
    public static void main (String[] args){
       
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
   
//        Let's first calculate number of digits in the number

        int tempNum = num;
        int totalDigits = 0;        //e.g you get 3

        while(tempNum > 0){
            tempNum = tempNum / 10;
            totalDigits++;
        }
        
        tempNum = num;
        int sum = 0;
        while (tempNum > 0){
            int lastDigit = tempNum % 10;					//it will get last digit (e.g. = 4)
            sum += (Math.pow(lastDigit, totalDigits));       // e.g 0 = 0 + 4^3
            tempNum = tempNum / 10; 						 //it will remove last digit
        }

  // Now compare sum with the given number

        if(sum == num){
            System.out.println("Given Number is a ArmStrong Number");
        } else {
            System.out.println("Given Number is a NOT a ArmStrong Number");
        }
	}
}
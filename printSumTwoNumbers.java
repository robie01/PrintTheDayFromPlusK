import java.util.*;

// to do:
//1. find the digit sum of each number in array
//2. when you have the sum of each number(per index) compare it to the rest if there's another same value
//3. If yes sum it up and return the value else -1

class GetTheSumOfTwoNumbers {
	// stores the sum of each givenNumbers
	int sumOfVal = 0;
	
		
	
	public static void main(String[] args) {
		GetTheSumOfTwoNumbers b = new GetTheSumOfTwoNumbers();
		int[] numbers = {12, 36, 54, 23}; // 36, 54 = 9 total: 18
		//System.out.println("The sum of digits: "+b.sumOfDigits(number)); 
		System.out.print(b.findingSumInEachIndexArray(numbers));

	}
	public int sumOfDigits(int digit)
	{
		int sumOfDigits = 0;
		while(digit != 0)
		{
			// % 10 to get the last digit of the number
			sumOfDigits = sumOfDigits + digit % 10;
			// removes the last digit
			digit = digit/10;
			
			
		}
		//System.out.println(sumOfDigits);
		return sumOfDigits;
	}
	

	public String findingSumInEachIndexArray(int[] givenNumbers)
	{
		try 
		{
			
			int val = 0;
			int total = 0;
			for (int i = 0; i < givenNumbers.length; i++) 
			{
				// compare and then swap if second is bigger than first
				for (int j = i + 1; j < givenNumbers.length; j++) {
					if (givenNumbers[i] > givenNumbers[j]) {
						val = givenNumbers[i];
						givenNumbers[i] = givenNumbers[j];
						givenNumbers[j] = val;
						System.out.println("Digits that has similar sum:" + val);
						sumOfVal = sumOfDigits(val);
						System.out.println("Sum of digits:" +  sumOfVal);
					
						
					}
				}
			
			}
			
			total = sumOfVal + sumOfVal;
			System.out.println("Total: " + total);
				
		} 
		catch (Exception e) {
			System.out.println(e);
		}
						
		return null;
	
	}
	

}



































//try 
//{
//	int val = 0;
//	for (int i = 0; i < givenNumbers.length; i++) 
//	{
//		val = givenNumbers[i];
//		sumOfVal = sumOfDigits(val);
//	}
//	
//} 
//catch (Exception e) {
//	System.out.println(e);
//}
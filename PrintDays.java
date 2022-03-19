
// to do:
//1. Get the index of weekdays
//2. iterate and set condition(check if the input is equal to index value 
//3. if yes return the value. 
//4. then use modulus for addition with K
class PrintTheDaysFromPlusK {
	
	static String[] weekdays = new String[] {"Mon", "Tue", "Wed","Thu", "Fri", "Sat", "Sun"};
	String indexofDay;
	
	public static void main(String[] args) {
	
//		try {
//			for (int i = 0; i <= weekdays.length; i++)
//						System.out.print(weekdays[i]+ " ");
//			}
//		catch (Exception e) {
//					System.out.println("\nException caught");
//			}
		PrintTheDaysFromPlusK printDay = new PrintTheDaysFromPlusK();
		System.out.print(printDay.getIndex("Wed", 8) + "\n"); // Thu
		System.out.print(printDay.getIndex("Tue", 12)); // Sun
		//printDay.getIndex("Tue");
		//System.out.print("index of selected day" + indexofDay);
		
	}
	
	public String getIndex(String dayGiven, int K){
		
		try 
		{
			for (int i = 0; i < weekdays.length; i++) 
			{
				if(weekdays[i] == dayGiven)
				{
					int calculatedSum = (i + K) % 7;
					indexofDay = weekdays[calculatedSum];
					//indexofDay = Integer.parseInt(dayGiven);
					return indexofDay;
					
				}
			}
		}
		catch (Exception e)
		{
				System.out.print(e);
			
		}
		return null;
	}
	
}


public class StringCalculator {
	
	 int Add(String Numbers) {
		int sum =0;
		 String[] numbers = Numbers.split(",");
		 for(String s: numbers) 
			 sum=sum+Integer.parseInt(s);
		 return sum;
		
	}
	
	public static void main (String args[]) {
	try {
		String numberString = "1,2";
		String numberString2 = "";

		StringCalculator sc = new StringCalculator();
		System.out.println(sc.Add(numberString)) ;
		System.out.println(sc.Add(numberString2)) ;
		
		
		}
	catch(Exception e)
	{
		System.out.println("0");
	}
}
}

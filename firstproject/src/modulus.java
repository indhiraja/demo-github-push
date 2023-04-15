
public class modulus {
	public static void main (String [] args)
	{
		void extractDigits(final int startValue)
		{
		int remainingValue = startValue;
		while(remainingValue>0)
		{
			final digit=remainingValue % 10;
			
			System.out.println(digit);
			remainingValue=remainingValue/10;
			
		}
		
		}
		System.out.println();
		
		
		
	}

}

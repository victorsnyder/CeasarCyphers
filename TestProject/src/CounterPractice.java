
public class CounterPractice 
		{
 //this class is the counter class built from scratch. 
		
			private int value;
			
			public CounterPractice()
			{
				value = 0;
			}
			
			public int getValue()
			{
				return value;
			}
			
			public void click() 
			{
				value = value + 1;
			}
			
			public void unclick()
			{
				value = value - 1;
			}
			
			public void reset()
			{
				value = 0;
			}
			//added a main method to apply the counter!
			public static void main(String[] args)
			{
				CounterPractice countdooku = new CounterPractice();
						countdooku.click();
						countdooku.click();
						countdooku.click();
						countdooku.click();
						countdooku.click();
						
				System.out.println(countdooku.getValue());
						
				
			}
			
		}
	





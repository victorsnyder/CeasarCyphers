
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
			
			
		}
	





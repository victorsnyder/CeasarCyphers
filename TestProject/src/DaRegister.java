//class that records a purchase, receives payment, returns change,
//and resets. 
public class DaRegister 
{
	private double purchase;
	private double payment;
	//initialize variables
	public DaRegister()
	{}
	//records purchase price
	public void Purchase(double amount)
	{
		purchase = purchase + amount;
	}
	//records payment received
	public void Payment(double amount)
	{
		payment = payment + amount;
	}
	//calculates & returns change and resets. 
	public double giveChange()
	{
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}
}

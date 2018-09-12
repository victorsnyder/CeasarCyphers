//class that records a purchase, receives payment, returns change,
//and resets. 
public class DaRegister 
{
	private double purchase;
	private double payment;
	private double tax;
	//initialize variables
	public DaRegister()
	{
		purchase = 0;
		payment = 0;
		tax = 1.115;
	}
	//records purchase price and determines whether the tax need be applied. 
	//this is a static method
	public void PurchaseTax(double amount, boolean isTaxable)
	{
		purchase = purchase + amount;
		if(isTaxable = true)
		purchase = purchase * tax;
	}
	//records payment received
	//static method
	public void Payment(double amount)
	{
		payment = payment + amount;
	}
	//calculates & returns change and resets. 
	//static method
	public double giveChange()
	{
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}
}

public class RetailItem
{
	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem (String description,int unitsOnHand, double price)
	{
		this.description=description;
		this.unitsOnHand=unitsOnHand;
		this.price =price;
	}
	public String getDescription ()
	{
		return description;
	}
	public int getUnitsOnHand ()
	{
		return unitsOnHand;
	}
	public double getPrice ()
	{
		return price;
	}
	public void setDescription (String description)
	{
		this.description= description;
	}
	public void setUnitsOnHand (int unitsOnHand)
	{
		this.unitsOnHand= unitsOnHand;
	}
	public void setPrice (double price)
	{
		this.price= price;
	}
	public void itemPurchased()
	{
		unitsOnHand= unitsOnHand - 1;
		
	}
	public void restockItem(int restockAmount) 
	{
		unitsOnHand= unitsOnHand+restockAmount;
		
	}
	public String toString ()
	{
		return "\nDescription: "+ description + "\n Units On Hand: " +unitsOnHand + "\n Price: "+ price ;  
	}
}
	

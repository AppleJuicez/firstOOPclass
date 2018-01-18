
public class MenuItem 
{
	public int itemID;
	public double price;
	public String menuName;
	public String category;
	
	
	
	public MenuItem(int itemID , String menuName , String category , double price)
	{
		this.itemID = itemID;
		this.menuName = menuName;
		this.category = category;
		this.price = price;
	}
	
	
	
	public MenuItem(int itemID , String category)
	{
		this.itemID = itemID;
		this.category = category;
		this.price = 30;
	}

	
	
	public void displayMenuDetail()
	{
		System.out.println("\nID = " + itemID + 
							"\nPrice = " + price + 
							"\nName = " + menuName + 
							"\ncategory = " + category + "\n");
	}
	
	
	
	public void increasePrice(int percent)
	{
		this.price = this.price * (100+percent) / 100;
	}
	
	
}

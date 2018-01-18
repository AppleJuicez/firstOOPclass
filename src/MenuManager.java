
public class MenuManager 
{
	public MenuItem[] menus;
	
	public MenuManager(int num_of_menus)
	{
		menus = new MenuItem[num_of_menus];
		for(int i = 0; i < num_of_menus ; i++)
		{
			menus[i] = new MenuItem(i+1 , "food");
		}
	}
	
	public void increaseAllPrice(int percent)
	{
		for(int i = 0; i < this.menus.length ; i++)
		{
			menus[i].increasePrice(percent);
		}
	}
	
	public void displayAllMenu()
	{
		for(int i = 0; i < this.menus.length ; i++)
		{
			if(menus[i]!= null)
				menus[i].displayMenuDetail();
		}
	}
}

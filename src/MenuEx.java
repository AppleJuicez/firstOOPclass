import javax.swing.JOptionPane;

public class MenuEx {

	public static void main(String[] args) 
	{
		MenuItem[] menu = new MenuItem[4];
		String menuName,priceString;
		double price;
		for(int i = 0; i< menu.length ; i++)
		{
			menuName = JOptionPane.showInputDialog("Name of menu item?");
			priceString = JOptionPane.showInputDialog("Price of menu item?");
			price = Double.parseDouble(priceString);
			menu[i] = new MenuItem( i+1 , menuName , "food" , price);
		}

		for(int i = 0; i< menu.length ; i++)
		{
			menu[i].displayMenuDetail();
		}
		
		menu[2].increasePrice(10);
		menu[3].increasePrice(20);
		
		for(int i = 0; i< menu.length ; i++)
		{
			menu[i].displayMenuDetail();
		}
		
		
		MenuManager X = new MenuManager(5);
		X.increaseAllPrice(20);
		X.displayAllMenu();
		
		
	}

}

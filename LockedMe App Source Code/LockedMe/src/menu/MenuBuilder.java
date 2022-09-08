package menu;
public class MenuBuilder {
	
	
	public static  Menu getMenu(int menuOption)
	{
		Menu menu;
		switch(menuOption)
		{
		case 0:
			menu = new WelcomeScreenMenu();
			AppHandler.setCurrentMenu("WelcomeScreen");
			return menu;
		case 1:
			menu = new MenuOption1();
			AppHandler.setCurrentMenu("MenuOption1");
			return menu;
		case 2:
			menu = new MenuOption2();
			AppHandler.setCurrentMenu("MenuOption2");
			return menu;
			
		}
		return new WelcomeScreenMenu();
		
	}
	

}

package menu;

import java.util.HashMap;
public abstract class Menu {

	public HashMap<String, String> operationList = new HashMap<String, String>();
	public boolean IsSelected;
	protected abstract void populateOperationList();
	public abstract void displayMenu();	
	public abstract void inputHandler(String input);

	
}

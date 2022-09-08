package menu;
import helper.CommandParser;
import operation.*;
public class MenuOption1 extends Menu {
    
	Operation opt;
	String currentCMD;
	public  MenuOption1()
	{
		this.IsSelected=true;
		this.populateOperationList();
		
		
	}
	protected void populateOperationList()
	{
		this.operationList.put("GAF", "View all file list");
			
	}
	
	public void displayMenu()
	{
		System.out.println();
		System.out.println();
		System.out.println();		
		System.out.println("*****You are at menu 1 : View file list*****");
		System.out.println("Please chose from below options:");
		this.operationList.forEach((key, value)->
		 {
		    System.out.println(value + "-> " + key );
		 });
				
				
	}
	
	public void inputHandler(String option)
	{		
		if(option.contains("CMD"))
		{
			this.currentCMD=option.substring(4).toUpperCase();
		}
			
		CommandParser.inputHandler(option, 1, this.currentCMD);
		
	}
	
}

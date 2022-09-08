package menu;

import helper.CommandParser;
import operation.Operation;

public class MenuOption2 extends Menu {
	Operation opt;
	String currentCMD;

	public MenuOption2() {
		this.IsSelected = true;
		this.populateOperationList();

	}

	protected void populateOperationList() {
		this.operationList.put("AF", "Add File");
		this.operationList.put("DF", "Delete File");
		this.operationList.put("SF", "Search File");

	}

	public void displayMenu() {

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("*****Your are at menu 2: Add/Remove/Search file******");
		System.out.println("Please chose from below options:");
		this.operationList.forEach((key, value) -> {
			System.out.println(value + "-> " + key);
		});

	}

	public void inputHandler(String option) {
		if (option.contains("CMD")) {
			this.currentCMD = option.substring(4).toUpperCase();
		}
		CommandParser.inputHandler(option, 2, this.currentCMD);
	}

}

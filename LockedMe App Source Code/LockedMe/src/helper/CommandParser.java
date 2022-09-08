package helper;

import menu.AppHandler;
import operation.Operation;
import operation.OperationBuilder;

public class CommandParser {

	public static Operation opt;

	public static void inputHandler(String option, int prevMenu, String inUseCommand) {
		if (option.toUpperCase().equals("BACK") || option.toUpperCase().equals("N")) {
			try {
				AppHandler.changeMenu(prevMenu);
			} catch (Exception e) {
				System.out.println("Operation failed<" + option + " : " + e.getMessage());
			}

		}
		if (option.toUpperCase().equals("Y")) {
			try {

				OperationBuilder ob = new OperationBuilder();
				opt = ob.getOperation(inUseCommand);
				System.out.println("enter command FILE <filename>");
			} catch (Exception e) {
				System.out.println("Operation failed<" + option + " : " + e.getMessage());
			}

		}
		if (option.contains("CMD-")) {
			try {
				OperationBuilder ob = new OperationBuilder();
				opt = ob.getOperation(option.substring(4).toUpperCase());
				System.out.println("enter command FILE-<filename>");
			} catch (Exception e) {
				System.out.println("Operation failed<" + option + " : " + e.getMessage());
			}

		}
		if (option.toUpperCase().contains("FILE-")) {
			if (option.toUpperCase().contains("FPATH-") && option.toUpperCase().contains("FNAME-")) {
				int pathpos = option.toUpperCase().indexOf("FPATH-");
				int namepos = option.toUpperCase().indexOf("FNAME-");
				String fpath = option.substring(pathpos + 6, namepos).trim();
				String fname = option.substring(namepos + 6).trim();
				try {
					opt.execute(fpath, fname);

				} catch (Exception e) {
					System.out.println("Operation failed<" + option + " : " + e.getMessage());
				}

			} else {
				try {
					opt.execute(option.substring(5));
				} catch (Exception e) {
					System.out.println("Operation failed : " + e.getMessage());
				}
			}

			System.out.println("Perform Operation again?Y/N");
		}

	}

}

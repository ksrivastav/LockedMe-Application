package operation;

public class OperationBuilder {

	public Operation getOperation(String operation) {
		Operation opr;
		System.out.println("Operation--- " + operation.trim());
		operation = operation.trim();
		if (operation.equals("GAF")) {
			opr = new GetAllFilesOperation();
			return opr;
		}
		if (operation.equals("AF")) {
			opr = new AddFileOperation();
			return opr;
		}
		if (operation.equals("DF")) {
			opr = new DeleteFileOperation();
			return opr;
		}
		if (operation.equals("SF")) {
			opr = new SearchFileOperation();
			return opr;
		} else {
			opr = new DefaultInvalidOperation();
			return opr;

		}

	}

}

package operation;

import helper.FileHandler;

//import java.io.File;
public class DeleteFileOperation implements Operation {

	public void execute(String filename) {
		System.out.println("DeleteFileOperation" + " " + filename);
		FileHandler fh = new FileHandler(filename);
		boolean createSuccess = fh.deleteFile();
		if (createSuccess == true) {
			System.out.println("Deletion Successfull");
		} else {
			System.out.println("Deletion Failed");
		}

	}

	public void execute(String fpath, String fname) {
		FileHandler fh = new FileHandler(fpath, fname);
		boolean createSuccess = fh.deleteFile();
		if (createSuccess == true) {
			System.out.println("Deletion Successfull");
		} else {
			System.out.println("Deletion Failed");
		}
	}

}

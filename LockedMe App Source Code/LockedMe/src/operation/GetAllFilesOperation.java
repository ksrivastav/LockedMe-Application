package operation;
//import java.util.Collections;

import java.io.File;

import helper.FileHandler;

public class GetAllFilesOperation implements Operation {

	public void execute(String filename) {
		System.out.println("***GAF Operation****");

		File fsub = new File(filename);
		FileHandler.getAllFileList(fsub, 0);

	}

	public void execute(String fpath, String fname) {
		File fsub = new File(fpath);
		FileHandler.getAllFileList(fsub, 0);

	}

}

package operation;

import java.io.File;
import java.util.ArrayList;

import helper.FileHandler;

public class SearchFileOperation implements Operation {

	public void execute(String fpath, String filename) {
		System.out.println("****SF*****");
		File fh = new File(fpath);
		ArrayList<String> fileList = FileHandler.getAllFileArrayList(fh);		
		String fname = filename.toUpperCase();
		fileList.forEach((file) -> {
			if (file.toUpperCase().contains(fname)) {
				System.out.println(file);
			}
		});
		FileHandler.fileArrayList.removeAll(fileList);

	}

	public void execute(String filename) {
		System.out.println("****SF*****");
		System.out.println("****This funcitonality is not available*****");

	}

}
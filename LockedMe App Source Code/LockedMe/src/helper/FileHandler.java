package helper;

import java.io.File;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

import helper.EmptyFileList;

public class FileHandler {

	public File fileHandler;
	public static ArrayList<String> fileArrayList = new ArrayList<String>();

	public FileHandler(String path) {
		System.out.println(path);
		fileHandler = new File(path);

	}

	public FileHandler(String path, String name) {
		System.out.println(path);
		fileHandler = new File(path, name);

	}

	public void getAllFileList() {
		try {
			File[] fileList;
			fileList = fileHandler.listFiles();
			if (fileList.length < 1) {
				throw new Exception("No File Found");
			}

			List<File> list = Arrays.asList(fileList);
			Collections.sort(list);
			list.forEach((file) -> {

				System.out.println("     ->" + file.getName());
			}

			);
		} catch (Exception e) {
			System.out.println("     ->" + "Empty Directory");
		}
	}

	public boolean createNewFile() {
		try {	
			boolean creationFlag = fileHandler.createNewFile();
			return creationFlag;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	public boolean deleteFile() {
		try {
			boolean delFlag = fileHandler.delete();
			return delFlag;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	public File[] searchFile() {
		File[] fileList;
		try {

			fileList = fileHandler.listFiles();
			return fileList;
		} catch (Exception e) {
			EmptyFileList emp = new EmptyFileList();

			return emp.getEmptyFileList();
		}

	}

	public static void getAllFileList(File f, int ident) {
		String space = " ";
		try {
			File[] fileList;
			fileList = f.listFiles();
			if (fileList.length < 1) {
				throw new Exception("No File Found");
			}

			List<File> list = Arrays.asList(fileList);
			Collections.sort(list);
			list.forEach((file) -> {
				if (file.isHidden() == false) {
					if (file.isDirectory() == true) {
						System.out.println(space.repeat(ident + 1) + " +" + file.getName());
						File fsub = new File(file.getAbsolutePath().toString());
						getAllFileList(fsub, ident + 1);
					} else {
						System.out.println(space.repeat(ident + 1) + "   ->" + file.getName());
					}
				}
			});

		} catch (Exception e) {
			System.out.println(space.repeat(ident + 1) + "   ->" + "Empty Directory/No File Found");

		}
	}

	public static ArrayList<String> getAllFileArrayList(File f) {

		try {
			File[] fileList;
			fileList = f.listFiles();
			if (fileList.length < 1) {
				throw new Exception("No File Found");
			}

			List<File> list = Arrays.asList(fileList);
			Collections.sort(list);
			list.forEach((file) -> {
				if (file.isHidden() == false) {
					if (file.isDirectory() == true) {
						// System.out.println(space.repeat(ident+1) +" +"+file.getName());
						File fsub = new File(file.getAbsolutePath().toString());
						getAllFileArrayList(fsub);
					} else {
						fileArrayList.add(file.getAbsolutePath());
					}
				}
			});

			return fileArrayList;
		} // end try clock
		catch (Exception e) {
			fileArrayList.add("NoFileFound");
			return fileArrayList;
		}
	}

}// end of class

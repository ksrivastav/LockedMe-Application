package helper;
import java.io.File;
public class EmptyFileList {
	
	File[] emptyFileList;
	
	public File[] getEmptyFileList()
	{ 
		
		
		String tempFilePath ="./src/resources/FileNotFound.txt";
		emptyFileList = new File[1];

		try {
		File f = new File(tempFilePath);	
		emptyFileList[0] = f;
		}
		catch(Exception e)
		{
			System.out.println("EmptyFileHandler exception:"+ e.getMessage());
		}
		
			
		return emptyFileList;
		
		
	}
}

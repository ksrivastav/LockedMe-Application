package operation;
public class DefaultInvalidOperation implements Operation {

	public void execute(String filename)
	{
		System.out.println("Invalid Operation on : "+ " "+ filename);
	
	}
	
	public void execute(String fpath, String fname )
	{
		System.out.println("Invalid Operation on : "+ " "+ fname);
	}
}
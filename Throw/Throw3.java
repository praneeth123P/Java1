package Throw;

//user defined exception//

class UserDefinedException extends Exception
{
	public UserDefinedException(String str)
	{
		super(str);
	}
}
public class Throw3 
{

	public static void main(String[] args) 
	{
		try
		{
			throw new UserDefinedException("this is user defined exception");
		}
		catch(UserDefinedException e)
		{
			System.out.println("this is message");
			System.out.println(e.getMessage());
		}
		
	}

}

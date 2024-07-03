package exception;

public class final1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//When an exception does not occur//
try
{
	int a = 25/5;
	System.out.println(a);
	
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
finally
{
	System.out.println("finally block is always executed");
}
     System.out.println("rest of the code");
	}

}

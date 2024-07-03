package exception;

public class final2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//When an exception occurr but not handled by the catch block//
try
{
	System.out.println("there is no type");

int a = 25/0;
System.out.println(a);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
finally
{
	System.out.println("final of the exceuted");
}
System.out.println("rest of the code");

}
}

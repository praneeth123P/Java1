package exception;

public class multiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	String s = "abc";
	int i = Integer.parseInt(s);
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
catch(NullPointerException e)
{
	System.out.println(e);
}
catch(NumberFormatException e)
{
	System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e);
}
System.out.println("rest of the code");
	}

}

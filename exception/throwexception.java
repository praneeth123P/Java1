package exception;

public class throwexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	String s1 = null;
	int data = 100/0;
}
catch(NullPointerException e)
{
	System.out.println(e);
}
System.out.println("rest of the code");

	}

}

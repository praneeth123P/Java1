package exception;

public class typecatch1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int arr[] = {1,2,3,4};
	System.out.println(arr[5]);
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e);
}
System.out.println("rest of the code");
	}

}

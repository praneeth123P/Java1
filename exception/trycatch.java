package exception;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*try
{
	int data = 50/0;
}
catch(ArithmeticException e)
{
	System.out.println(e);
}
    System.out.println("rest of the code");
	}

}*/
		try {
			int a = 100/0;
			System.out.println("rest of the code");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	
	}
}

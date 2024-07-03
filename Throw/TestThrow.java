package Throw;

public class TestThrow {

	public static void validate(int age)
	{
		if(age < 18)
		{
			throw new ArithmeticException("person is not eligible");
		}
		else
		{
			System.out.println("age is not limited");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
validate(13);
System.out.println("rest of the code");
	}

}

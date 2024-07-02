package strings;

public class stringrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		String s1 = "";

		for (int i = 0; i < s.length(); i++) {
		  s1 = s.charAt(i) + s1;
		}

		System.out.println("Reversed string: "+ s1);
	}

}

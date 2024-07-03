package Files;
import java.io.FileOutputStream;
public class Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileOutputStream fout = new FileOutputStream("C:\\Users\\user\\Desktop\\TestFiles\\hello world.txt");
	String s = "hi hello world";
	byte b[] = s.getBytes();
	fout.write(b);
	fout.close();
	System.out.println("success");
} catch (Exception e) {
	e.printStackTrace();
}
	}

}

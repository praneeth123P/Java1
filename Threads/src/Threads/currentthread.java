package Threads;

public class currentthread extends Thread
{
public void run()
{
	System.out.println(Thread.currentThread().getName());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		currentthread t1  =new currentthread();
		currentthread t2 = new currentthread();
		t1.start();
		t2.start();
	}

}

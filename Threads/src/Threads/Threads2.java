package Threads;
//by implementing runnable interface//
public class Threads2 implements Runnable
{
public void run()
{
	System.out.println("the thread is running");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Threads2 m1 = new Threads2();
Thread t1 = new Thread(m1);
t1.start();
	}

}



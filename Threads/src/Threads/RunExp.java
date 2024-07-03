package Threads;

public class RunExp implements Runnable 
{
	public void run()
	{
		System.out.println("running");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RunExp m1 = new RunExp();
Thread t1 = new Thread(m1);
t1.start();
	}

}

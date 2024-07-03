package Threads;

public class RunExp1 extends Thread
{
	public void run()
	{
		System.out.println("running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RunExp1 t1 = new RunExp1();
t1.run();
	}

}

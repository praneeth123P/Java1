package Threads;
//by extending thread class//
public class Threads extends Thread
{
	public void run()
	{
		System.out.println("the thread is running.......");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Threads t1 = new Threads();
t1.start();
	}

	}

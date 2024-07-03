package Threads;
//user defined priority//
public class userpriority  extends Thread
{
	public void run()
	{
		System.out.println("running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userpriority t1 = new userpriority();
		userpriority t2 = new userpriority();
		t1.setPriority(2);
		t2.setPriority(10);
		System.out.println("priority of Thread t1 is:"+t1.getPriority());
		System.out.println("priority of Thread t2 is:"+t2.getPriority());
		
		t1.start();
		t2.start();
	}

}

package Threads;

public class setpriority extends Thread
{
public void run()
{
	System.out.println("priority is:"+Thread.currentThread().getPriority());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 setpriority  t1 = new  setpriority();
		 t1.setPriority(Thread.MAX_PRIORITY);
		 //t1.setPriority(Thread.MIN_PRIORITY);//
		 //t1.setPriority(Thread.NORM_PRIORITY);//
		 t1.start();
	}

}

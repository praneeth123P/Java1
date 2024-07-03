package Threads;

public class Table1
{
	synchronized void printTable1(int n)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(n * i);
		}
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
		  System.out.println(e);
		}
	}
class MyThread1 extends Table1
{
	Table t;
	MyThread1(Table t1)
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(4);
	}
}
class MyThread2 extends Table1
{
	Table t;
	MyThread2(Table 12);	
	{
		this.t = t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
public class TestSynchroinze{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table  t  obj  =   new Table();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		

	}
}
}




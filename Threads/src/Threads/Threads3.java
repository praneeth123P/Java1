package Threads;
//when you call the start method more than one time//
public class Threads3 extends Thread 

{
public void run()
{
	System.out.println("first thread is running");
}
public static void main(String[] args) {
	

Threads3 t1 = new Threads3();

t1.start();
t1.start();{

	

	}

}
}

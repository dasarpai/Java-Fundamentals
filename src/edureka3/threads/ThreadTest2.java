package edureka3.threads;

class MyTask2 extends Thread
{
 public void run() 
 {
	 Thread t = Thread.currentThread();
	 System.out.println(t);
 }
}

public class ThreadTest2 
{
	public static void main(String[] args) 
	{
		System.out.println("No of Active Threads = "+ Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		MyTask2 mt = new MyTask2();
		mt.start();
		
		System.out.println("No of Active Threads = "+ Thread.activeCount());
	}
}

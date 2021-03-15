package edureka3.threads;

public class Lifecycle {

	public static void main(String[] args) throws InterruptedException {
		Thread mt = Thread.currentThread();
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}
	}
}

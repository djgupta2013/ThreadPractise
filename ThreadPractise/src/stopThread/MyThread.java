package stopThread;

public class MyThread extends Thread{
	private volatile boolean flag=true;
	int count=0;
	
	public void stopRunning() {
		flag=false;
	}
	
	@Override
	public void run() {
		while(flag) {
			System.out.println("thread is running");
			count++;
		}
		System.out.println("thread is stop...");
		System.out.println(count);
	}

}

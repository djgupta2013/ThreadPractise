package stopThread;

public class MainClass {

	public static void main(String[] args) {
		MyThread thread=new MyThread();
		
		thread.start();
		try {
			Thread.sleep(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		thread.stopRunning();

	}

}


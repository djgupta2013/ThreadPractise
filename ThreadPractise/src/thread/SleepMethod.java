package thread;

public class SleepMethod extends Thread {
	
	public SleepMethod(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1500);
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
	

	public static void main(String[] args) {
		SleepMethod sleepMethod=new SleepMethod("Hello");
		sleepMethod.start();
		System.out.println("Before sleeping");
		System.out.println("sleeping");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println("after sleeping");
		
	}


	

}

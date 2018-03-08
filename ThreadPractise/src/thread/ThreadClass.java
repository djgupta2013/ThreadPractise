package thread;

public class ThreadClass {
	
	static class Thread1 extends Thread{
		public void run() {
			System.out.println(getName()+" thread1 class ");
		}
		
	  }
	static class Thread2 implements Runnable{

		@Override
		public void run() {
			System.out.println("thread2 ...");
		}
		
	}
	public static void main(String[] args) {
		Thread1 thread1=new Thread1();
		thread1.setName("1234");
		thread1.setDaemon(true);
		thread1.start();
		System.out.println(thread1.getId());
		Thread2 thread2=new Thread2();
		thread2.run();
		
		System.out.println("before sleeping threads");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println("after sleeping");
		
		
		
	}

}

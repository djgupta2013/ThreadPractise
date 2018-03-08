package waitNotify;

public class Threadss {

	public static void main(String[] args) {
		final Shared shared=new Shared();
		
		Thread thread=new Thread() {

			@Override
			public void run() {
				shared.methodOne();
			}
			
		};
		
		Thread thread2=new Thread() {

			@Override
			public synchronized void start() {
				shared.methodTwo();
			}
			
		};
		thread.start();
		thread2.interrupt();
		try {
			thread.wait(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(thread.getState());

	}
}

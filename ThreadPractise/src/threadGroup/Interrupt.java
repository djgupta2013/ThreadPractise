package threadGroup;

public class Interrupt {

	public static void main(String[] args) {
		ThreadGroup parentGroup=new ThreadGroup("Parent group");
		Thread thread=new Thread(parentGroup, "Thread 1") {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					System.out.println("Thread interrupted");
				}
			}
			
		};
		thread.start();
		
		Thread thread2=new Thread(parentGroup, "Thread 2") {

			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (Exception e) {
					System.out.println("Thread interrupted");
				}
			}	
	};
	thread2.start();
	ThreadGroup childGroup=new ThreadGroup(parentGroup,"child thread");
	Thread thread3=new Thread(childGroup,"Thread 3") {

		@Override
		public void run() {
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println("Thread interrupted");
			}
		}
		
	};
	thread3.start();
	//parentGroup.interrupt();
	
	}

}

package waitNotify;

public class Shared {
	synchronized void methodOne() {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName()+" is relasing the lock and going to wait");
		try {
			wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*try {
			notify();
			System.out.println("hello");
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		notifyAll();
		System.out.println(thread.getName()+" got the object lock back and can continue with it's execution");
	}
	
	synchronized void methodTwo() {
		Thread thread=Thread.currentThread();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		System.out.println("ABCD");
		notify();
		System.out.println("A thread which is waiting for lock of this object is notified by "+thread.getName());
		
	}

}

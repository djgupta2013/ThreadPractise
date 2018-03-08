package deadLockExample;

public class DeadLock {

	public static void main(String[] args) {
		final Shared shared=new Shared();
		final Shared shared2=new Shared();
		
		Thread thread=new Thread() {

			@Override
			public void run() {
				shared.methodOne(shared2);
			}
			
		};
		
		Thread thread2=new Thread() {

			@Override
			public void run() {
				shared2.methodTwo(shared);
			}
			
		};
		
		thread.start();
		thread2.start();

	}

}

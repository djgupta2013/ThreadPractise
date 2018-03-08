package shareMemory;

public class SharedMemory {

	public static void main(String[] args) {
	
		final Shared shared=new Shared();
		Thread thread=new Thread() {

			@Override
			public void run() {
				shared.sharedMethod();
			}
			
		};
		Thread thread2=new Thread() {
			@Override
			public void run() {
				shared.sharedMethod();
			}
		};
		thread.start();
		thread2.start();
	}

}

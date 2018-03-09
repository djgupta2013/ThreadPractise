package shareMemory;

public class Shared {
	int i;
	synchronized void sharedMethod() {
		Thread thread=Thread.currentThread();
		i=10;
		System.out.println(i);
		System.out.println(thread.getName());
		i=20;
		System.out.println(i);
		System.out.println(thread.getName());
		i=100;
		System.out.println(i);
		System.out.println(thread.getName());
	}

}

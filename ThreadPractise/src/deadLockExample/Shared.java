package deadLockExample;

public class Shared {
	
	synchronized void methodOne(Shared s) {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName()+" is executing methodOne");
		System.out.println(thread.getName()+" is calling methodTwo");
		s.methodTwo(this);
		System.out.println(thread.getName()+" is finished executing methodOne");
	}
	
	synchronized void methodTwo(Shared s) {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName()+" is executing methodTwo");
		System.out.println(thread.getName()+" is calling methodOne");
		s.methodTwo(this);
		System.out.println(thread.getName()+" is finished executing methodTwo");
	}

}

package threadGroup;

public class ThreadGroupExaple {

	public static void main(String[] args) {
		ThreadGroup trGroup=new ThreadGroup("Parent thread group");
		
		Thread thread=new Thread(trGroup,"Thread 1");
		Thread thread2=new Thread(trGroup,"Thread 2");
		System.out.println(thread);
		System.out.println(thread2);
		
		ThreadGroup childGroup=new ThreadGroup(trGroup,"child thread group");
		System.out.println(childGroup.getParent());
		childGroup.setDaemon(true);
		System.out.println(childGroup.isDaemon());
		ThreadGroup tGroup=new ThreadGroup(childGroup,"ABC");
		System.out.println(tGroup);

	}

}

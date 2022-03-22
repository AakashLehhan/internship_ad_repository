package demo_thread01;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("Main Thread Started ");
		System.out.println("Main Name : "+Thread.currentThread().getName());
		System.out.println("Main Id : "+Thread.currentThread().getId());
		System.out.println("Main Priority : "+Thread.currentThread().getPriority());
		System.out.println("Main Is it Daemon : "+Thread.currentThread().isDaemon());
		System.out.println("Main isAlive : "+Thread.currentThread().isAlive());
		
		for(int i=1;i<100;i++) {
			System.out.print(".");
		}
		Thread th=new Thread();
		th.setName("MyThread");
		th.setPriority(10);
		th.start();// its makes new thread to work in its own context
		System.out.println("MyThread Name : "+th.getName());
		System.out.println("MyThread Id : "+th.getId());
		System.out.println("MyThread Priority : "+th.getPriority());
		System.out.println("MyThread Is it Daemon : "+th.isDaemon());
		System.out.println("MyThread isAlive : "+th.isAlive());
		
		
		
		System.out.println("Main Thread Ended ");
		System.out.println("Main isAlive : "+Thread.currentThread().isAlive());
		
		
	}

}

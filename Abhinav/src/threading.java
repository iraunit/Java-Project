class MyTask extends Thread{
	@Override
	public void run () {
		for(int doc=1; doc<10; doc++) {
			System.out.println("Printing Doc MyTask "+ doc);
		}
	}
}

class CA{
	void hello() {
		System.out.println("HELlo");
	}
}

 class Task extends CA implements Runnable {
	
 public void run() {
	for(int i=0; i<10; i++) {
		System.out.println("Hello world "+i);
	}
	
}
	
}



public class threading {

	public static void main(String[] args) {
		Runnable r=new Task();
		Thread task=new Thread(r);
		task.start();
//		r.run();
		System.out.println("Application Started");
		MyTask m=new MyTask();
		m.start();
		for(int doc=1; doc<10; doc++) {
			System.out.println("Printing Doc "+ doc);
		}
		Thread a=Thread.currentThread();
		System.out.println("Thread name "+a);
		a.setName("set name thread");
		System.out.println("Thread name "+a);
		System.out.println("Application Ended");

	}

}

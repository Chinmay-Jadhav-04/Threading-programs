
public class Demo5 extends Thread {
	public void run() {
		int a=10;
		for(int i=1;i<=10;i++) {
		System.out.println(a*i);
		}
	}

	public static void main(String[] args) {
		Demo5 d1=new Demo5();
		Demo5 d2=new Demo5();
		System.out.println("Running thread1");
		d1.start();
		d1.setPriority(MIN_PRIORITY);
		try {
			d1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Running Thread2");
		d2.setPriority(MAX_PRIORITY);
		d2.start();
		
		System.out.println("priority d1:"+d1.getPriority());
		System.out.println("prority d2:"+d2.getPriority());
		
		
	}

}
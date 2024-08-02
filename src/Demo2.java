
public class Demo2 implements Runnable {
	@Override
	public void run() {
		System.out.println("This is run method");
		
	}

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		Thread t1=new Thread(d);
		
		t1.start();
	}

	

}

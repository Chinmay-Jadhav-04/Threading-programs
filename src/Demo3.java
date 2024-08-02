
public class Demo3 extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Demo3 d1=new Demo3();
		Demo3 d2=new Demo3();
		Demo3 d3=new Demo3();
		
		d1.start();
		try {
			d1.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		d2.start();
		try {
			d2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		d3.start();
		
		System.out.println("Thread one:" + d1.getName());
		d1.setName("Chinmay");
		System.out.println("Thread one:" + d1.getName());
		System.out.println("Thread ID1:"+ d1.getId());
		
		
		System.out.println("Thread two:" + d2.getName());
		d2.setName("Tanuj");
		System.out.println("Thread two:" + d2.getName());
		System.out.println("Thread ID2:"+ d2.getId());
		
		System.out.println("Thread three:" + d3.getName());
		d3.setName("Divesh");
		System.out.println("Thread three:" + d3.getName());
		System.out.println("Thread ID3:"+ d3.getId());
	}

}


public class Demo1 extends Thread {
	public void run(){
		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		
		d1.start();
		System.out.println();

	}

}

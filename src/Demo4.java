import java.util.Scanner;

public class Demo4 extends Thread {

	public void run() {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number:");
	    int no=sc.nextInt();
	    for(int i=1;i<=10;i++) {
	    	System.out.println(no*i);
	    }
	}
	public static void main(String[] args) {
		
		Demo4 d=new Demo4();
		Demo4 d1=new Demo4();
		Demo4 d2=new Demo4();
		d.start();
		try {
			d.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d1.start();
		try {
			d1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d2.start();

	}

}
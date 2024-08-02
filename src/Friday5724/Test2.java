package Friday5724;

class Topi{
	 void printTable(int n) {
		 synchronized(this) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
		}
		 }
	}
}

class MyTopi extends Thread{
	Topi Topi1;
	MyTopi(Topi Topi1){
		this.Topi1=Topi1;
	}
	public void run() {
		Topi1.printTable(6);
	}
}

class MyTopi1 extends Thread{
	Topi Topi1;
	MyTopi1(Topi Topi1){
		this.Topi1=Topi1;
	}
	public void run() {
		Topi1.printTable(8);
	}
}


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

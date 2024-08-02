package Friday5724;

class Topi{
	synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
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


public class Test1 {

	public static void main(String[] args) {
	Topi Topi2=new Topi();
	
	MyTopi t1=new MyTopi(Topi2);
	MyTopi1 t2=new MyTopi1(Topi2);
	
	t1.start();
	t2.start();

	}

}

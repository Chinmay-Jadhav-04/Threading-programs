package Friday5724;

class AccountHolder{
	int amount=2000;
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw amount");
		if(this.amount<amount) {
			System.out.println("Transaction failed due to insufficientg balance:");
				try {
					wait();
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				this.amount=this.amount-amount;
				System.out.println("Transaction done"+this.amount);
		}
	}
	synchronized void deposits(int amount) {
		System.out.println("going to deposit amount");
		this.amount=this.amount+amount;
		System.out.println("deposit process done"+this.amount);
		notify();
	}
}

public class Test3 {

	public static void main(String[] args) {
		AccountHolder a=new AccountHolder();
		new Thread() {
			public void run() {
				a.withdraw(5000);
			}
		}.start();
		new Thread() {
			public void run() {
				a.deposits(100000);
			}
		}.start();

	}

}

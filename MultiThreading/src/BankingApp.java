enum TransactionType {
	WITHDRAWL,
	DEPOSITE,
	CHECK_BAL
}

class TransactionThread extends Thread {
	Account act;
	float amt;
	TransactionType type;

	TransactionThread(Account act, TransactionType type, float amt) {
		this.act = act; this.type = type; this.amt = amt;
	}

	public void run() {
		switch (this.type) {
		case WITHDRAWL: 
			this.act.withdrawl(amt);
			break;
		case DEPOSITE:
			this.act.deposit(amt);
			break;
		case CHECK_BAL:
			this.act.checkBalance();
			break;
		}
	}
}


class Account {
	int actNo;
	float balance;
	
	Account(int actNo, float balance) {
		this.actNo = actNo;
		this.balance = balance;
	}
	
	synchronized void withdrawl(float amt) {
		System.out.println("Amount before withdrawl: " + this.balance);
		if (amt <= this.balance) {
			this.balance -= amt;
		} else {
			System.out.println("Insufficient balance..");
			return;
		}
		System.out.println("Amount after withdrawl: " + this.balance);
	}
	
	synchronized void deposit(float amt) {
		System.out.println("Amount before Deposit: " + this.balance);
		if (amt > 0) {
			this.balance += amt;
		} else {
			System.out.println("Invalid amount..");
			return;
		}
		System.out.println("Amount after Deposit: " + this.balance);
	}
	
	void checkBalance() {
		System.out.println("Your current balance is: " + this.balance);
	}
}

public class BankingApp {
	public static void main(String[] args) {
		Account a1 = new Account(101, 10000); // Deposit - 2000
		Account a2 = new Account(201, 8000) ; // withdraw - 3000
		
		TransactionThread t1 = new TransactionThread(a1, TransactionType.DEPOSITE, 2000);// Rob
		TransactionThread t2 = new TransactionThread(a2, TransactionType.WITHDRAWL, 3000);// Bob
		t1.start();
		t2.start();
	}
}

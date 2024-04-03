interface bankInterface{
	void deposit();
	void withdraw();
	void calculateInterest();
	void viewBalance();
}

class bank implements bankInterface{
	double amount;
	double interestRate;
	
	bank(double amount, double interestRate) { this.amount = amount; this.interestRate = interestRate;}
	public void deposit() {
		System.out.println("This is Bank Class ");
	}
	public void withdraw() {
		System.out.println("This is Bank Class ");
		
	}
	public void calculateInterest() {
		System.out.println("This is Bank Class ");
		
	}
	public void viewBalance() {
		System.out.println("This is Bank Class ");

	}
}

class savingAccount extends bank {
	//double amount;
	savingAccount(double amount, double interestRate){ 
		super(amount,interestRate);
		System.out.println("savingClass objects created");
		}
	public void deposit() {
		System.out.println("This is savingAccount Class ");
		
	}
	public void withdraw() {
		System.out.println("This is savingAccount Class ");
		
	}
	public void calculateInterest() {
		System.out.println("This is savingAccount Class ");
		
	}
	public void viewBalance() {
		System.out.println("This is savingAccount Class ");
		System.out.printf("Saving Account:\n" ,
				"%.2f" , amount ,
				"Interest Rate:" + interestRate);
	}
	
}

class currentAccount extends bank{
	currentAccount(double amount, double interestRate){ 
		super(amount, interestRate);
		System.out.println("savingClass objects created");
		}
	public void deposit() {
		System.out.println("This is currentAccount Class ");
		
	}
	public void withdraw() {
		System.out.println("This is currentAccount Class ");
		
	}
	public void calculateInterest() {
		System.out.println("This is currentAccount Class ");
		
	}
	public void viewBalance() {
		System.out.println("This is currentAccount Class ");
		System.out.printf("Current Account:\n" ,
				"Initial Deposit: $ %. 2f" , super.amount ,
				"OverDraftLimit:", super.amount);
		System.out.println("Amount: " + amount);
	}
}

public class mian {

	public static void main(String[] args) {
		System.out.println("Osama Malik");
		bank obj;
		obj = new savingAccount(1000, 1.25);
		obj.viewBalance();
		
		obj = new currentAccount(1000, 1.25);
		obj.viewBalance();
	}

}

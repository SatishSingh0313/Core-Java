interface Bank{
	void Deposit(int Amount);
	void Withdraw(int Amount);
	void CheckBalance();
}
class ATM implements Bank{
	
	int Balance=20000;
	@Override            
	public void Deposit(int Amount) {
		
		System.out.println("Depositing Rs."+Amount);
		Balance=Balance+Amount;
		System.out.println("Amount Deposited Successfully");
	}

	@Override
	public void Withdraw(int Amount) {
		System.out.println("Withdrawing Rs."+Amount);
		//Balance-=Amount;
		Balance=Balance-Amount;
		System.out.println("Amount Withdrawn Successfully");
	}

	@Override
	public void CheckBalance() {
		System.out.println("Availabke Balance Rs."+Balance);
		
	}
}
public class AcountHolder {

	public static void main(String[] args) {
		System.out.println("Welcome To Account Holder");
		System.out.println("--------------------------");
		Bank b1=new ATM();
		b1.CheckBalance();
		System.out.println("---------------------------");
		b1.Deposit(4000);
		b1.CheckBalance();
		System.out.println("------------------------------");
		b1.Withdraw(7000);
		b1.CheckBalance();
		System.out.println("---------------------------");
		
		System.out.println("Without Security");
		ATM a1=new ATM();
		a1.CheckBalance();
		System.out.println("---------------------------");
		a1.Deposit(3000);
		a1.CheckBalance();
		a1.Withdraw(4000);
		a1.CheckBalance();

	}
}

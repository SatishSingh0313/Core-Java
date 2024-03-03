
class Account{
	long actNo = 8458458554L;
	double bal;
	String owner = "Satish";
	
	public void deposit(double amt) {
		bal= bal+amt;
		System.out.println("the balance after deposite is "+ bal);
	}
	public void withdraw(double amt) {
		bal = bal- amt;
		System.out.println("the balnce after withdraw is "+ bal);
	}
}
class Saving extends Account{
	double roi = 14.50;
	
	
	public void calculateroi() {
		bal = bal+roi;
		System.out.println("the balance after adding roi is "+ bal);
		
	}
}
class Current extends Account{
	double min_bal = 500;
	public void show_minBal() {
		System.out.println("the min balance is "+ min_bal);
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		
		Saving s1 = new Saving();
		System.out.println(s1.owner +" "+ s1.actNo);
		s1.deposit(1000);
		s1.withdraw(200);
		s1.calculateroi();
		
		Current c1 = new Current();
		c1.show_minBal();
		
	}

}


class Account {
	
private  double Bal;

public void setBal(double Bal){
	
	if(Bal>0) {
	
	this.Bal=Bal;
	}
	else {
		System.out.println("Transaction Failed Due to Insufficient Bal");
	}
}

public double getBal(){
	
	return Bal;
	
  }
}

class Transaction{
	
	public static void deposit(double amount,Account ref) {
		double b1=ref.getBal();
		b1=b1+amount;
		ref.setBal(b1);
	}
	
	public static void Withdraw(double amount, Account ref) {
		double b2=ref.getBal();
		b2=b2-amount;
		ref.setBal(b2);
	}
	
	public static void CheckBal(Account ref) {
		double Bal=ref.getBal();
		System.out.println("Current Balnce is : "+Bal);
	}
}
public class Bank {
public static void main(String[] args){
	      
	Account a1= new Account();
	Transaction.CheckBal(a1);
	Transaction.deposit(1050.50, a1);
	Transaction.CheckBal(a1);
	
	System.out.println("-----------------------");
	
	Transaction.Withdraw(400, a1);
	Transaction.CheckBal(a1);
	Transaction.Withdraw(700, a1);
	Transaction.CheckBal(a1);
	
	}
	
}


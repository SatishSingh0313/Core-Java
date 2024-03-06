package customise.exception;

	class Account {
		private  double Bal;

	public void setBal(double Bal){
	
	if(Bal>0) {
	this.Bal=Bal; 
	
	}else {
		
		IllegalArgumentException i =
		    new IllegalArgumentException("Transaction Failed Due to Insufficient Balance");
		throw i;
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
	
	public class Customise_Exception {
		public static void main(String[] args){
	      
	Account a1= new Account();
	Transaction.CheckBal(a1);
	Transaction.deposit(1000, a1);
	Transaction.CheckBal(a1);
	Transaction.Withdraw(500,a1);
	Transaction.Withdraw(600, a1);
	
	 }
	}


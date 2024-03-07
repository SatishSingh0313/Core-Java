package deadlock;

  class TotalEarning1 extends Thread{
    int Totalamount=0;
    
    public void run() {
   	 synchronized(this) {
   		 for(int i=1;i<=10;i++) {
   			 Totalamount=Totalamount+100;
   		 }
   		 this.notify();
   	 }
    }
  }
  	public class Deadlock_Handle {
	 public static void main(String[] args) {
		 
		TotalEarning1 t1 = new TotalEarning1();
    	t1.start();
    	synchronized(t1) {
    		try {
    			t1.wait();
    		}
    		catch(InterruptedException e1) {
    			e1.printStackTrace();
    		}
    	}
    	System.out.println("Total Earning: "+"Rs "+t1.Totalamount);
	}
  }

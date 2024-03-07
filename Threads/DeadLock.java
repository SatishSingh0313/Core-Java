	package deadlock;
	
	//Deadlock Situation
	
	class TotalEarning extends Thread{
		
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
   public class DeadLock {
    public static void main(String[] args)  {
		
    	TotalEarning t1 = new TotalEarning();
    	t1.start();
    	System.out.println("Total Earning: "+"Rs "+t1.Totalamount);
    }
  }
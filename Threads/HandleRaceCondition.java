package race.condition;

	class TaskHandle{
	
	synchronized void div(int num) {
	
	for(int i=1;i<=5;i++) {
		System.out.println(num/i);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e1) {
			System.out.println(e1);
		}
	  }
    }
 }

	class Task1 extends Thread{
		TaskHandle t1;
		Task1(TaskHandle t1){
	    this.t1=t1;
     }
		
	public void run() {
		t1.div(100);
	}	
   }

	class Task2 extends Thread{
		TaskHandle t1;
		Task2(TaskHandle t1){
		this.t1=t1;
	}
		public void run() {
			t1.div(100);
		}	
	}

	public class HandleRaceCondition {
		public static void main(String[] args) {
			TaskHandle t = new TaskHandle();
			Task1 m1 = new Task1(t);
			Thread t1 = new Thread(m1);
			t1.start(); 
            
            Task2 m2 = new Task2(t);
            Thread t2 = new Thread(m2);
            t2.start();
		}
    }




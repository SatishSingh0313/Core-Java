	package race.condition;

	class Task{
		
	 void div(int num) {
		
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
	
	class Mythread1 extends Thread{
	Task t1;
	Mythread1(Task t1){
		this.t1=t1;
	}
		public void run() {
			t1.div(50);
		}	
     }
	
	class Mythread2 extends Thread{
		Task t1;
		Mythread2(Task t1){
			this.t1=t1;
		}
			public void run() {
				t1.div(50);
			}	
	     }
	
	public class RaceCondition {
	 public static void main(String[] args) {
	Task t = new Task();
	Mythread1 m1 = new Mythread1(t);
	Thread t1 = new Thread(m1);
	t1.start();
	
	Mythread2 m2 = new Mythread2(t);
	Thread t2 = new Thread(m2);
	t2.start();
      }
    }



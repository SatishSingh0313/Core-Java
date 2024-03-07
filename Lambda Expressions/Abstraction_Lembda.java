	package com.Thread;
	
	interface Ecomerce{
	  void Login();
	  void logout(); 
    }
	
	class Flipkart implements Ecomerce{
		@Override
		public void Login() {
		System.out.println("Flipkart User Login Successfully : **** ");
		}
		
		@Override
		public void logout() {
		System.out.println("Flipkart User Logout Successfully");
		}
      }
	class Amazon implements Ecomerce{
		
		@Override
		public void Login() {
		System.out.println("Amazon User Login Successfully : **** " );
	  }

	@Override
	public void logout() {
		System.out.println("Amazon User Logout Successfully");
		}
    }
	
	class Association{
	 public Ecomerce Pin(int Pwd) {
		 Ecomerce Reff;
		 if(Pwd==1234) {
			 Reff=new Flipkart();
			 return Reff;
		 }else{
			  Reff = new Amazon();
		 return Reff;
		  }
	    }
      }
	
	public class Abstraction_Lembda {
		public static void main(String[] args) {
		  
		Runnable r1=()-> {
		
		Association a1=new Association();
		Ecomerce e1=a1.Pin(1234);
		e1.Login();
		e1.logout();
		
		System.out.println("===========================");
		
		Ecomerce e2=a1.Pin(4321);
		e2.Login();
		e2.logout();
		
	 };
	 
		r1.run();
	}
  }



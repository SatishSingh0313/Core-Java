  package com.Thread;

   public class Lambda_Function {
     public static void main(String[] args) {
	
	 Runnable ref = ()->
	 {
		 for(int i=1;i<=5;i++) {
			 System.out.println(i);
		 }
	 };
	 
	 ref.run();
	 
	 System.out.println("------------------");
	 
	 Runnable r1=()->{
		for(int j=6;j<=10;j++) {
			System.out.println(j);
		}
	 };
	 
	 r1.run();
    }
   }

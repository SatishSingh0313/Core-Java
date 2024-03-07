package com.Thread;

public class Thread_Runnable implements Runnable{

	@Override
	public void run() {
		System.out.println("This is Runnable interface");	
	}
	
	public static void main(String[] args) {
		
		Thread_Runnable tr = new Thread_Runnable();
		Thread t1 = new Thread(tr);
		
		t1.start();
	}
	
}

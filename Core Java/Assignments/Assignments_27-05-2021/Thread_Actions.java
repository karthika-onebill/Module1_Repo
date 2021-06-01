/*  
 * suspending resuming and stopping threads
 * 
 * suspend()  -  is a method of Thread class puts the thread from running to waiting state.
 *            -  used to stop the thread execution
 *            -  suspend threads are can be resumed using resume() method.
 * 
 * resume()  - method of Thread class
 * 			 - resume the thread which was susbended using susbend
 * 
 * stop()   - method of thread class
 *          - terminates the thread execution
 *          - Once the thread is stopped ,it cannot be restarted again
 *          
 *          
 *  
 */
package com.onebill.java_basics.assignments;

public class Thread_Actions extends Thread {
 @Override
public void run() {
	for(int i=1;i<=5;i++) {
		try {
			sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
}
	public static void main(String[] args) throws InterruptedException {
		
		//creating threads
		Thread_Actions t1 = new Thread_Actions();
		Thread_Actions t2 = new Thread_Actions();
		Thread_Actions t3 = new Thread_Actions();
		Thread_Actions t4 = new Thread_Actions();
		//call run threads
		t1.start();
		t2.start();
		//suspend the thread
		System.out.println("Thread 0 is waiting ...");
		t1.wait();
		
		System.out.println("Thread 1 is suspended!!");
		t2.suspend();     
		//call another thread
		t3.start();
		System.out.println("Threa 0 is wokeup");
		t1.notify();
		System.out.println("thread 1 is resumed !!"); //resume the thread
		t2.resume();
		System.out.println("Stop the thread 2");
		t3.stop();
		
	}

}

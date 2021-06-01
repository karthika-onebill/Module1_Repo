/*
 *    Thread Pool - reuses previously created threads to execute current tasks a
 *    			  - offers a solution to the problem of thread cycle overhead and resource thrashing.
 *                -  need :  JVM creating too many threads at the same time can cause the system to run out of memory
 *           
 *    Steps :
 *    
 *     1. Create a task(Runnable Object) to execute
	   2. Create Executor Pool using Executors
	   3. Pass tasks to Executor Pool
	   4. Shutdown the Executor Pool
 * 
 *   Executor  -> implemnets (ExecutorService - interface) ; extends (ThreadPoolExecutor - class)
 * 
 */
package com.onebill.java_basics.assignments;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
	String message;

	public Task(String msg) {
		message = msg;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start the task : " + message);

		System.out.println(Thread.currentThread().getName() + " End the task : " + message);
	}

	void process() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Thread_Pool {

	public static void main(String[] args) {

		// thread pool
		ExecutorService executor = Executors.newFixedThreadPool(5); // Thread pool size : 3 (only 3 threads are allowed
																	// to run)
		for (int i = 1; i <= 10; i++) {
			Runnable task = new Task(" is " + i); // creating threads
			executor.execute(task); // executing in thread pools
		}
		executor.shutdown(); // finish the thread pool
		/*while (!executor.isTerminated()) {
			System.out.println("Is non terminated!! Deadlock occured!");
		}*/

		System.out.println("Finished all threads");

	}

}

/*
 *  Thread Group - Java provides a convenient way to group multiple threads in a single object.
 *          
 *               - we can suspend, resume or interrupt group of threads by a single method call.
 *                
 *               - java.lang.ThreadGroup 
 *               
 *        Methods :  (1) checkAccess()   -> currently running thread have a rights to modify the thread group
 *        
 *                   (2) activeCount()   -> no of active threads in thread group
 *                   
 *                   (3) activeGroupCount() ->  number of active groups in the thread group
 *                   
 *                   (4) destroy()        -> destroy the thread groups
 *                   
 *                   (5) getMaxPriority()  -> returns the maximum priority of the thread group.
 *                   
 *                   (6) getName()         -> return the name of the thread group
 *                   
 *                   (7) getParent()       -> return the name of the parent thread
 *                   
 *                   (8) interrupt()       -> This method interrupts all threads in the thread group.
 *                   
 *                   (9)isDaemon()         -> This method tests if the thread group is a daemon thread group.
 *                   
 *                   (10) setDaemon(boolean daemon)-> This method changes the daemon status of the thread group.
 *                   
 *                   (11) isDestroyed()     ->  This method tests if this thread group has been destroyed.
 *                   
 *                   (12) list()           -> This method prints information about the thread group 
 *                   
 *                   (13) suspend()        -> This method is used to suspend all threads in the thread group.
 *                   
 *                   (14) resume()         -> 	This method is used to resume all threads in the thread group which was suspended using suspend() method.
 *                   
 *                   (15)setMaxPriority(int pri) -> This method sets the maximum priority of the group.
 *                    
 *                   (16) stop()           ->  This method is used to stop all threads in the thread group.
 *                   
 * 
 * 
 */
package com.onebill.java_basics.assignments;

public class Thread_Group implements Runnable{

	  public void run() {  
          System.out.println(Thread.currentThread().getName());  
    }  
   public static void main(String[] args) {  
	   		Thread_Group group = new Thread_Group();  
          ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");   // invoking ThreadGroup class
            
          Thread t1 = new Thread(tg1, group,"one");  
          t1.start();  
          Thread t2 = new Thread(tg1, group,"two");  
          t2.start();  
          Thread t3 = new Thread(tg1, group,"three");  
          t3.start();  
               
          System.out.println("Thread Group Name: "+tg1.getName());  
         tg1.list();  
  
    }  

}

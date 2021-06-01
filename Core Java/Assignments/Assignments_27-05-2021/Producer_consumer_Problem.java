/*
 *  Producer - Consumer Problem
 *  
 *  Storage : no_of_items (Max_Capacity : 500items)
 * 
 * Producer : ( user_input : no_of_item to be produced ? (add storge) (If not beyond the max capacity)
 * Consumer : ( user_input : no_of_item to be consumed ? (dec storage) (if not below the 0 item)
 * 
 *  Demonstarting multi threading _ synchronization concepts
 */
package com.onebill.java_basics.assignments;

import java.util.Scanner;

/* storage class */
class Storage {
	int MAX_CAPACITY = 500;
	int capacity;

	void toCalculate(int type, int no_of_items) {
		if (type == 1) {
			// producer
			if((capacity+no_of_items)>MAX_CAPACITY) {
				System.err.println("Storage filled ! Try to give minimum no_of_items\n");
			}
			else {
				capacity += no_of_items;
				System.out.println("Thank you for producing such good products !\n Storage  : "+capacity);
			}
			
			
			
		} else {
			// consumer
			if((capacity-no_of_items)<0) {
				System.err.println("Empty storage! \n");
			}
			else {
				capacity -= no_of_items;
				System.out.println("Thank you for consuming such good products !\n Storage  : "+capacity);
			}
			
		}
		
	}
}

/* Producer class */
class Producer extends Thread {
	int produce_no_of_items;
	Storage p_storage;

	public Producer(Storage obj) {
		p_storage = obj;
	}

	void input(Scanner sc) {
		System.out.println("Enter the no of items to be produce : ");
		produce_no_of_items = sc.nextInt();
	}

	@Override
	public void run() {

		p_storage.toCalculate(1, produce_no_of_items);
	}
}
/* Consumer class */
class Consumer extends Thread {
	int consumer_no_of_items;
	Storage c_storage;

	public Consumer(Storage obj) {
		c_storage = obj;
	}

	void input(Scanner sc) {
		System.out.println("Enter the no of items to be consume : ");
		consumer_no_of_items = sc.nextInt();
	}

	@Override
	public void run() {

		c_storage.toCalculate(2, consumer_no_of_items);
	}
}

public class Producer_consumer_Problem {

	public static void main(String[] args) {
		int ch,exit=1;
		Scanner sc = new Scanner(System.in);
		Storage obj = new Storage();
		Producer producer = new Producer(obj);
		Consumer consumer = new Consumer(obj);
		while(exit==1) {
		System.out.println("----------Producer Consumer Problems----------");
		System.out.println(" 1 : Producer\n 2 : Consumer\n 3 :Exit\nEnter the choice : ");
		ch = sc.nextInt();
		switch (ch) {
		case 1: // producer
			producer.input(sc);
			producer.run();
			break;
		case 2: // consumer
			consumer.input(sc);
			consumer.run();
			break;
		case 3 : //exit
			exit=0;
			System.out.println("thank you for coming!!");

		}}

	}

}

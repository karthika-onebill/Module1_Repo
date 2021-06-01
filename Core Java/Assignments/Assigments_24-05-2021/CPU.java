
package com.onebill.java_basics.assignments;

import java.io.IOException;
import java.util.Scanner;


class CPU_Config {
	private class RAM{
		long memory_capacity;
		String memory_type;
		 String sup_os ;
		public RAM(long memory_capacity, String memory_type, String sup_os) {
			super();
			this.memory_capacity = memory_capacity;
			this.memory_type = memory_type;
			this.sup_os = sup_os;
		}
		void display() {
			System.out.println("RAM configurations:\n Memory Capacity :"+memory_capacity+"\n Memory Type :"+memory_type+"\nSupporting OS :"+sup_os);
		}
		
	}
	private class Memory{
		long memory_capacity;
		String memory_type;
		 String sup_os ;
		public Memory(long memory_capacity, String memory_type, String sup_os) {
			super();
			this.memory_capacity = memory_capacity;
			this.memory_type = memory_type;
			this.sup_os = sup_os;
		}
		void display() {
			System.out.println("RAM configurations:\n Memory Capacity :"+memory_capacity+"\n Memory Type :"+memory_type+"\nSupporting OS :"+sup_os);
		}
		
	}
	private class Speed{
		long speed;
		String memory_type;
		 String sup_os ;
		public Speed(long memory_capacity, String memory_type, String sup_os) {
			super();
			this.speed = memory_capacity;
			this.memory_type = memory_type;
			this.sup_os = sup_os;
		}
		void display() {
			System.out.println("RAM configurations:\n Memory Capacity :"+speed+"\n Memory Type :"+memory_type+"\nSupporting OS :"+sup_os);
		}
		
	}
	
	void display(int i) {
		switch(i) {
		case 1 :RAM ram = new RAM(14000,"RAM","LINUX");
				ram.display();
				break;
		case 2 : Memory memory = new Memory(1200,"ROM","Windows");
		memory.display();
		break;
		case 3 : Speed speed = new Speed(1,"ROM","Kernel");
		speed.display();
		break;
		}
	}

}
class CPU{
	public static void main(String[] args) throws IOException {
		CPU_Config config = new CPU_Config();
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice :\n 1 :RAM\n2:Memory\n3:Speed,\n4:Keyboard\n5:OS");
		ch = sc.nextInt();
		switch(ch) {
		case 1 : //Ram
				config.display(1);
				break;
		case 2 : //memory
				config.display(2);
				break;
		case 3 : //speed
				config.display(3);
				break;
	
			default : System.out.println("Wrong choices");
		}
				
		
	}
}

import java.util.Scanner;

import javax.swing.JFrame;

public class MisHilosConVariable extends Thread {
	

	static Dato dato=new Dato();
	
	
	public void run() {
		for (int i = 0; i < 1000; i++) {
			dato.increm();
		}
		System.out.println("---> "+dato.getX());
	}
	
	public static void main(String[] args) {
		MisHilosConVariable hilo1 = new MisHilosConVariable();
		MisHilosConVariable hilo2 = new MisHilosConVariable();
		hilo1.setName("Hilo 1");
		hilo2.setName("Hilo 2");
		hilo1.start();
		hilo2.start();
	}

}

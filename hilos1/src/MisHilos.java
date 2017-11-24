import java.util.Scanner;

import javax.swing.JFrame;

public class MisHilos extends JFrame implements Runnable {
	
	static Scanner e;
	
	public void run() {
		String nombreHilo=this.getName();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("-----------------> "+nombreHilo);
			Thread.yield();
		}
		if(nombreHilo.equals("Hilo 2 <-----"))
			e.nextLine();
		for (int i = 0; i < 10; i++) {
			
			System.out.println("-----------------> "+nombreHilo);
			Thread.yield();
		}
	}
	
	public static void main(String[] args) {
		e= new Scanner(System.in);
		MisHilos hilo1 = new MisHilos();
		MisHilos hilo2 = new MisHilos();
		hilo1.setName("Hilo 1 <-----------------");
		hilo2.setName("Hilo 2 <-----");
		Thread h1,h2;
		(h1=new Thread(hilo1)).start();
		(h2=new Thread(hilo2)).start();
	}

}

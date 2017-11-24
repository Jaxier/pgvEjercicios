import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

import javax.swing.JFrame;

public class Hilos  extends JFrame  implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Excursionista persona;
	private static final Semaphore semaphore = new Semaphore(0);
	private static final Semaphore mutex = new Semaphore(2);
	
	private int count = 0;
	
	static Scanner e;
	
	public Hilos(Excursionista persona) {
		
		this.persona = persona;	
		
		
	}
	
	@Override
	public void run() {	
		try {
			// Solicitamos disponibilidad
			
			mutex.wait();
				count++;
			
				System.out.println(persona.getNombre()+" ha iniciado la excursión");
				
				if (count == 2) {
					semaphore.acquire();
					
					Thread.sleep(5000);
										
					semaphore.release();
				}			
						
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
}

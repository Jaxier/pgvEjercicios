package pgv.jardines.cerrojo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AppJardin {
	
	public static int con;
	public static Lock cerrojo= new ReentrantLock();
	public static final int CAP=5;			//Capacidad del jardin

	private static final int NUM_VIS =30;	//Número de visitantes que van a intentar entrar
	public static void main(String[] args) {
		for (int i = 1; i <= NUM_VIS; i++) {
			new Visitante(i).start();
		}
	}
}
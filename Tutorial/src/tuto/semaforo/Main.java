package tuto.semaforo;

public class Main {
	 
    public static void main(String[] args) {
         
        // Ejecutamos 10 procesos.
        for (int i = 0; i < 10; i++) {
            new Thread(new Semaforo("Proceso #" + i)).start();
        }      
    }
}

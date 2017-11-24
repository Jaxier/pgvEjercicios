package pgv.javalock;

public class HiloPut extends Thread {
	
	int aleatorio;
	@Override
	public void run() {
		super.run();
		try {
			
			for (int i = 0; i < 5; i++) {
				aleatorio =(int) (Math.random()*1000);
				System.out.println("Soy el productor "+getName()+" y produzco "+aleatorio);
				Main.buffer.put(aleatorio);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

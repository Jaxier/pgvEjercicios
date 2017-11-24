package pgv.javalock;

public class HiloGet extends Thread{

	@Override
	public void run() {
		super.run();
		
		try {
			System.out.println("Soy el consumidor "+getName()+" y recojo "+Main.buffer.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

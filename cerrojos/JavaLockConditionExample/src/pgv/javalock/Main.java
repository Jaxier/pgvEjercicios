package pgv.javalock;


public class Main {

	static BoundedBuffer buffer;
	public static void main(String[] args) {
	
		 buffer  = new BoundedBuffer();
		 HiloPut productor1 = new HiloPut();
		 HiloPut productor2 = new HiloPut();
	
		 
		 productor1.start();
		 productor2.start();
		
		 for (int i = 0; i < 10; i++) {
			new HiloGet().start();
		 }
			
			
		
	}

}

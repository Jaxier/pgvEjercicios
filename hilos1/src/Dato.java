
public class Dato{
		private int x;

		public int getX() {
			return x;
		}
		
		public  synchronized int increm() {
			x++;
			return x;
		}
		public synchronized int decrem() {
			return --x;
		}	
	}
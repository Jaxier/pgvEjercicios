import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.RandomAccessFile;

public class IncrementarEnFichero {

	public static void main(String[] args)  {
		
		int num;
		final int VUELTAS = 100;
		
		
		try {
			
			RandomAccessFile raf = new RandomAccessFile("numeros.dat","rw");
			
			for (int i = 0; i < VUELTAS; i++) {
				
				raf.seek(0);
				num = raf.readInt();
				raf.seek(0);
				num += 1;
				raf.writeInt(num);
				//System.out.print(num+" , ");
				Logger.getLogger("/home/usuario/rastro.log").log(
			            Level.INFO, num+" , ");
			}
			
			
		
			raf.close();
			
		} catch (Exception e) {
			Logger.getLogger("/home/usuario/rastro.log").log(
		            Level.SEVERE, "uyuyuy");
			
			
		}
		
	}

}


import java.io.IOException;
import java.io.RandomAccessFile;

public class Escribir {

	public static void main(String[] args) throws IOException {
		
		
		RandomAccessFile raf = new RandomAccessFile("numeros.dat", "rw");
		raf.writeInt(0);
		raf.close();
		
		
	}

}

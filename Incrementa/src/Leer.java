
import java.io.IOException;
import java.io.RandomAccessFile;

public class Leer {

	public static void main(String[] args) throws IOException {
		
		
		RandomAccessFile raf = new RandomAccessFile("numeros.dat", "rw");
		System.out.println(raf.readInt());
		raf.close();
		
		
	}

}

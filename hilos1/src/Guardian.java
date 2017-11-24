
public class Guardian {
	
	private int con;
	private int cap;
	
	public Guardian(int cap) {
		this.cap = cap;
	}
	public  synchronized boolean  dejameEntrar(int i) {
		boolean entro = false;
		if(con<cap) { 
			con++;
			System.out.printf("El visitante %d, entró, hay %d visitantes.\n",i,con);
			entro = true;
		}
		return entro;
	}
	public synchronized void quieroSalir(int i) {
			--con;
			System.out.printf("El visitante %d, salió, hay %d visitantes.\n",i,con);
	}
}

public class AppJardin {

	private static final int CAP=5;			//Capacidad del jardin
	private static final int NUM_VIS =10;	//Número de visitantes que van a intentar entrar

	public static void main(String[] args) {
		Guardian guardia = new Guardian(CAP);
		for (int i = 1; i <= NUM_VIS; i++) {
			new Visitante(guardia,i).start();
		}
	}
	

}

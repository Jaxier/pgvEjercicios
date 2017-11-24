
public class Visitante extends Thread {

	private Guardian guardia;
	private final int id; // Id del visitante
	private final static int T_VISITA_MAX=2001; // Id del visitante
	private final static int T_ESPERA=1000; // Id del visitante

	public Visitante(Guardian guardia, int id) {
		this.guardia = guardia;
		this.id = id;
	}

	@Override
	public void run() {
		super.run();
		System.out.printf("Soy %d y quiero entrar.\n",id);
		
		while (!guardia.dejameEntrar(id)) {
			try {
				sleep(T_ESPERA);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		try {
			sleep((int) (Math.random() * T_VISITA_MAX + 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		guardia.quieroSalir(id);
	}
}

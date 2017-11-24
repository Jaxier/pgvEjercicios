package pgv.jardines.cerrojo;

public class Visitante extends Thread {

	private final int id; // Id del visitante
	private final static int T_VISITA_MAX = 2001; // Id del visitante
	private final static int T_ESPERA = 1000; // Id del visitante
	private boolean estaDentro = false;

	public Visitante(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		super.run();
		System.out.printf("Soy %d y quiero entrar.\n", id);

		intentarEntrar();

		while (!this.estaDentro) {
			try {
				sleep(T_ESPERA);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			intentarEntrar();
		}

		try {
			sleep((int) (Math.random() * T_VISITA_MAX + 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		salir();
	}

	
	
	private void salir() {
		System.out.printf("Soy el visitante %d, estoy dentro con otros %d visitantes.\n",
				id, AppJardin.con-1);
		AppJardin.cerrojo.lock();
		AppJardin.con--;
		AppJardin.cerrojo.unlock();
		estaDentro = false;
	}

	private void intentarEntrar() {
		AppJardin.cerrojo.lock();
		if (AppJardin.con < AppJardin.CAP) {
			AppJardin.con++;
			estaDentro = true;
		}
		AppJardin.cerrojo.unlock();
	}
}

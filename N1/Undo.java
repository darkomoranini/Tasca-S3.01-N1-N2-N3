package N1;
import java.util.ArrayList;

public class Undo {
	
	private static Undo undo;
	private ArrayList<String> historial;

	private Undo() {
		historial = new ArrayList<>();
	}

	public static Undo getInstancia() {
		if (undo == null) {
			undo = new Undo();
		}
		return undo;
	}

	public void addComanda(String comanda) {
		historial.add(comanda);
	}

	public void eliminaUltimaComanda() {
		if (!historial.isEmpty()) {
			historial.remove(historial.size() - 1);
		}
	}

	public void listarComandas() {
		System.out.println("Historial:");
		for (int i = 0; i < historial.size(); i++) {
			System.out.println((i + 1) + ". " + historial.get(i));
		}
	}
}


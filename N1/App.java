package N1;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Undo undo = Undo.getInstancia();
		Scanner scanner = new Scanner(System.in);

		
		while (true) {
			System.out.println("(add/eliminar/listar/salir):");
			String option = scanner.nextLine();

			switch (option) {
			case "add":
				System.out.println("Ingresa una comanda:");
				String comando = scanner.nextLine();
				undo.addComanda(comando);
				break;

			case "eliminar":
				undo.eliminaUltimaComanda();
				break;

			case "listar":
				undo.listarComandas();
				break;

			case "salir":
				scanner.close();
				System.exit(0);
				break;

			default:
				System.out.println("Opcion invalida, intentelo de nuevo");
				break;
			}
		}
	}		

}

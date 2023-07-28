package N2;

public class App {

	public static void main(String[] args) {
		
		try {
			
		 FabricaAgenda fabricaEspana = new FabricaAgendaEspana();
		 Direccion direccionEspana = fabricaEspana.crearDireccion("Mare de Deu del Pilar, 2");
		 NumeroTelefono telefonoEspana = fabricaEspana.crearNumeroTelefono("633253016");

		 System.out.println(direccionEspana.obtenerDireccion());
	     System.out.println(telefonoEspana.obtenerNumeroTelefono());

	     FabricaAgenda fabricaItalia = new FabricaAgendaItalia();
		 Direccion direccionItalia = fabricaItalia.crearDireccion("Vizzolo Predabissi, 4");
		 NumeroTelefono telefonoItalia = fabricaItalia.crearNumeroTelefono("653253216");
		 
		 System.out.println(direccionItalia.obtenerDireccion());
	     System.out.println(telefonoItalia.obtenerNumeroTelefono());
	
		} catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
	}

}

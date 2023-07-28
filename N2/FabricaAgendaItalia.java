package N2;

public class FabricaAgendaItalia implements FabricaAgenda{
	
	    @Override
	    public Direccion crearDireccion(String direccion) {
	        return new DireccionEspana(direccion);
	    }

	    @Override
	    public NumeroTelefono crearNumeroTelefono(String numero) {
	        return new NumeroEspana(numero);
	    }

}

package N3;

public class ComandoArrancar implements Comando{
	
	private Vehiculo vehiculo;
	
	public ComandoArrancar(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
		
	}

	@Override
	public void ejecutar() {
		vehiculo.arrancar();
	}
}

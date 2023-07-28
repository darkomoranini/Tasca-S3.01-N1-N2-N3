package N3;

public class ComandoAcelerar implements Comando{
	
	private Vehiculo vehiculo;
	
	public ComandoAcelerar(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

	@Override
    public void ejecutar() {
        vehiculo.acelerar();
    }
	
}

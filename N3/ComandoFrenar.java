package N3;

public class ComandoFrenar implements Comando{
	
	private Vehiculo vehiculo;

    public ComandoFrenar(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void ejecutar() {
        vehiculo.frenar();
    }
}

package N3;

public class Avion extends Vehiculo{
	
	@Override
    public void arrancar() {
        System.out.println("El avión ha sido encendido.");
    }

    @Override
    public void acelerar() {
        System.out.println("El avión está aumentando la velocidad.");
    }

    @Override
    public void frenar() {
        System.out.println("El avión ha reducido la velocidad.");
    }

}

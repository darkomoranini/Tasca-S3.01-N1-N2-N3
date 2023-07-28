package N3;

public class Barco extends Vehiculo{
	
	@Override
    public void arrancar() {
        System.out.println("El barco ha sido encendido.");
    }

    @Override
    public void acelerar() {
        System.out.println("El barco está aumentando la velocidad.");
    }

    @Override
    public void frenar() {
        System.out.println("El barco ha reducido la velocidad.");
    }

}

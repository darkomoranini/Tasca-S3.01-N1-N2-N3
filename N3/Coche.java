package N3;

public class Coche extends Vehiculo{
	
	@Override
    public void arrancar() {
        System.out.println("El coche ha sido encendido.");
    }

    @Override
    public void acelerar() {
        System.out.println("El coche está aumentando la velocidad.");
    }

    @Override
    public void frenar() {
        System.out.println("El coche ha reducido la velocidad.");
    }

}

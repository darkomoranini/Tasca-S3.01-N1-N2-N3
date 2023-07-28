package N3;

public class Bicicleta extends Vehiculo{
	
	@Override
    public void arrancar() {
        System.out.println("La bicicleta ha sido encendido.");
    }

    @Override
    public void acelerar() {
        System.out.println("La bicicleta está aumentando la velocidad.");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta ha reducido la velocidad.");
    }

}

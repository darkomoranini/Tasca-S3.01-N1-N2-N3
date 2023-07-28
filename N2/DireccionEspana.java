package N2;

public class DireccionEspana implements Direccion{
	
	private String direccion;

    public DireccionEspana(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String obtenerDireccion() {
        return "ESPAÑA: " + direccion;
    }
}

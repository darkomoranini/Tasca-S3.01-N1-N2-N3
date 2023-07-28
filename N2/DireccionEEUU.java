package N2;

public class DireccionEEUU implements Direccion {

	private String direccion;

    public DireccionEEUU(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String obtenerDireccion() {
        return "EEUU: " + direccion;
    }
}

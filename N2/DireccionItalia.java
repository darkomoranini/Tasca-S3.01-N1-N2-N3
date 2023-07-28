package N2;

public class DireccionItalia implements Direccion{
	
	private String direccion;

    public DireccionItalia(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String obtenerDireccion() {
        return "ITALIA: " + direccion;
    }

}

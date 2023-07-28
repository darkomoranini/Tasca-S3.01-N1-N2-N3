package N2;

public class NumeroEspana implements NumeroTelefono{

	    private String numero;

	    public NumeroEspana(String numero) {
	        this.numero = numero;
	    }

	    @Override
	    public String obtenerNumeroTelefono() {
	        return "+34: " + numero;
	    }
}

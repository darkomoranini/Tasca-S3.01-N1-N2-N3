package N2;

public class NumeroEEUU implements NumeroTelefono{
	
	 private String numero;

	    public NumeroEEUU(String numero) {
	        this.numero = numero;
	    }

	    @Override
	    public String obtenerNumeroTelefono() {
	        return "+1: " + numero;
	    }

}

package N2;

public class NumeroItalia implements NumeroTelefono{
	
	 private String numero;

	    public NumeroItalia(String numero) {
	        this.numero = numero;
	    }

	    @Override
	    public String obtenerNumeroTelefono() {
	        return "+39: " + numero;
	    }

}

package N3;

public class App {
	
	 public static void main(String[] args) {
		 
		 Vehiculo coche = new Coche();
		 Vehiculo bicicleta = new Bicicleta();
		 Vehiculo avion = new Avion();
		 Vehiculo barco = new Barco();
		 
		 Comando arrancarCoche = new ComandoArrancar(coche);
		 Comando acelerarCoche = new ComandoAcelerar(coche);
		 Comando frenarCoche = new ComandoFrenar(coche);
		 
		 Comando arrancarBicicleta = new ComandoArrancar(bicicleta);
		 Comando acelerarBicicleta = new ComandoAcelerar(bicicleta);
		 Comando frenarBicicleta = new ComandoFrenar(bicicleta);
		 
		 Comando arrancarAvion = new ComandoArrancar(avion);
		 Comando acelerarBAvion = new ComandoAcelerar(avion);
		 Comando frenarAvion = new ComandoFrenar(avion);
		 
		 Comando arrancarBarco = new ComandoArrancar(barco);
		 Comando acelerarBarco  = new ComandoAcelerar(barco);
		 Comando frenarBarco  = new ComandoFrenar(barco);
		 
		 Invocador invocador = new Invocador();
		 
		 invocador.setComando(arrancarCoche);
	     invocador.executarComando();
	     
	     invocador.setComando(acelerarCoche);
	     invocador.executarComando();
		 
	     invocador.setComando(frenarCoche);
	     invocador.executarComando();
		 
		 
		 
		 
		 
		 
		 
		 
	 }

}

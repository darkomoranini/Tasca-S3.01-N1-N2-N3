package N3;

public class Invocador {

	private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void executarComando() {
        comando.ejecutar();
    }
}

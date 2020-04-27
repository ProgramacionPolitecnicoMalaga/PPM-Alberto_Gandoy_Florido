package Modelo.Excepcion;

public class NoSelecionadoException extends Exception {
    public NoSelecionadoException(String message) {
        super(message);
    }

    public NoSelecionadoException() {
        super();
    }
}

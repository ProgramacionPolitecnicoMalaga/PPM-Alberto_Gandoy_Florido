public abstract class AutorizadaAescribir extends Persona{

    public AutorizadaAescribir(String nick) {
        super(nick);
    }

    public abstract Mensaje escribirMensaje(String texto, int tipoMensaje, Persona destinatario);
}

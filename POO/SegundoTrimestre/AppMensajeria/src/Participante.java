public class Participante extends AutorizadaAescribir {

    public Participante(String nick) {
        super(nick);
    }

    @Override
    public Mensaje escribirMensaje(String texto, int tipoMensaje, Persona destinatario) {// 1 es tarea, 2 notificacion y 3 lectura
        Mensaje mensaje = null;
        try {
        if (tipoMensaje != 1 || tipoMensaje != 2 || tipoMensaje != 3) {
            throw new MensajeriaException("El tipo de mensaje no es correcto.");

        } else if (tipoMensaje == 1) {
            throw new MensajeriaException("El usuario no está autorizado a escribir una tarea");

        }
        else {
            mensaje = new Mensaje(tipoMensaje,texto,destinatario);
        }
        } catch (MensajeriaException e) {
            e.printStackTrace();
        }
        return mensaje;
    }
}

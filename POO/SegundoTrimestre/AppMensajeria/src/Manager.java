public class Manager extends AutorizadaAescribir {

    public Manager(String nick) {
        super(nick);
    }

    @Override
    public Mensaje escribirMensaje(String texto, int tipoMensaje, Persona destinatario) {
        Mensaje mensaje = null;
        if (tipoMensaje != 1 || tipoMensaje != 2 || tipoMensaje != 3) {
            try {
                throw new MensajeriaException("El tipo de mensaje no es correcto.");
            } catch (MensajeriaException e) {
                e.printStackTrace();
            }
        }else {
            mensaje = new Mensaje(tipoMensaje,texto,destinatario);
        }
        return mensaje;
    }

}

public class GestorControlador {
    private Suma suma;
    private Vista vista;

    public GestorControlador(Suma suma, Vista vista) {
        this.suma = suma;
        this.vista = vista;
    }

    public void setSuma(Suma suma) {
        this.suma = suma;
    }

    public void sumar() {
        int x = Integer.parseInt(vista.getTxtSuma());
        suma.sumar(x);
    }

    public AvisadorCambioSuma avisadorCambioSuma = new AvisadorCambioSuma() {
        @Override
        public void avisar(Suma suma) {
            vista.getLblResultado().setText(String.valueOf(suma.getTotal()));
        }
    };
}

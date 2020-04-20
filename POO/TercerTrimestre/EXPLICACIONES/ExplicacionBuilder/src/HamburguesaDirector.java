public class HamburguesaDirector {
        private HambuergesaBuilder.HamburguesaBuilder builder;

        public HamburguesaDirector(HambuergesaBuilder.HamburguesaBuilder builder){
            this.builder = builder;
        }

        public Hamburguesa servirHamburguesaNormal(){
            return builder.setTipo(TipoHambuerguesa.TipoHamburguesa.NORMAL).getResultado();
        }

        public Hamburguesa servirHamburguesaConQueso(){
            return builder.addQueso()
                    .setTipo(TipoHambuerguesa.TipoHamburguesa.CON_QUESO)
                    .getResultado();
        }

        public Hamburguesa servirHamburquesaCompleta(){
            return builder.addQueso()
                    .addLechuga()
                    .addTomate()
                    .setTipo(TipoHambuerguesa.TipoHamburguesa.COMPLETA)
                    .getResultado();
        }

        public Hamburguesa servirHamburguesaDoble(){
            return builder.setDoble()
                    .setTipo(TipoHambuerguesa.TipoHamburguesa.DOBLE)
                    .getResultado();
        }

        public Hamburguesa servirHamburguesaDobleCompleta(){
            return builder.setDoble()
                    .addQueso()
                    .addLechuga()
                    .addTomate()
                    .setTipo(TipoHambuerguesa.TipoHamburguesa.DOBLE_COMPLETA)
                    .getResultado();
        }

        public Hamburguesa servirHamburguesaCheeseBacon(){
            return builder.addQueso()
                    .addBacon()
                    .setTipo(TipoHambuerguesa.TipoHamburguesa.CHEESE_BACON)
                    .getResultado();
        }

        public Hamburguesa servirHamburguesaHercules(){
            return builder.setDoble()
                    .addQueso()
                    .addTomate()
                    .addBacon()
                    .addHuevo()
                    .addSalsaChile()
                    .setTipo(TipoHambuerguesa.TipoHamburguesa.HERCULES)
                    .getResultado();
        }

        public Hamburguesa servirHamburguesaGodzilla(){
            return builder.setDoble()
                    .addTomate()
                    .addLechuga()
                    .addCebolla()
                    .addPepinillo()
                    .addBacon()
                    .addBacon()
                    .addSalsaChile()
                    .setTipo(TipoHambuerguesa.TipoHamburguesa.GODZILLA)
                    .getResultado();
        }
}

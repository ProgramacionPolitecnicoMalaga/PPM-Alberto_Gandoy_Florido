public class HambuergesaBuilder {
    public static class HamburguesaBuilder {
        private Hamburguesa hamburguesa;


        public HamburguesaBuilder(){
            hamburguesa = new Hamburguesa();
        }

        public HamburguesaBuilder setTipo(TipoHambuerguesa.TipoHamburguesa tipo){
            hamburguesa.setTipo(tipo);
            return this;
        }

        public HamburguesaBuilder addQueso(){
            hamburguesa.setQueso();
            return this;
        }

        public HamburguesaBuilder addLechuga(){
            hamburguesa.setLechuga();
            return this;
        }

        public HamburguesaBuilder addTomate(){
            hamburguesa.setTomate();
            return this;
        }

        public HamburguesaBuilder setDoble(){
            hamburguesa.setDoble();
            return this;
        }

        public HamburguesaBuilder addCebolla(){
            hamburguesa.setCebolla();
            return this;
        }

        public HamburguesaBuilder addPepinillo(){
            hamburguesa.setPepinillo();
            return this;
        }

        public HamburguesaBuilder addBacon(){
            hamburguesa.setBacon();
            return this;
        }

        public HamburguesaBuilder addSalsaChile(){
            hamburguesa.setSalsaChile();
            return this;
        }

        public HamburguesaBuilder addHuevo(){
            hamburguesa.setHuevo();
            return this;
        }

        public Hamburguesa getResultado(){
            return hamburguesa;
        }

    }
}

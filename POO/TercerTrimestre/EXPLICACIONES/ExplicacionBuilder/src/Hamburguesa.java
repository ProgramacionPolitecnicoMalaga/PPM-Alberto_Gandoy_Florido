public class Hamburguesa {
    private TipoHambuerguesa.TipoHamburguesa tipo = TipoHambuerguesa.TipoHamburguesa.NORMAL;
    private boolean queso = false;
    private boolean lechuga = false;
    private boolean tomate = false;
    private boolean doble = false;
    private boolean cebolla = false;
    private boolean pepinillo = false;
    private boolean bacon = false;
    private boolean salsaChile = false;
    private boolean huevo = false;

    public void setTipo(TipoHambuerguesa.TipoHamburguesa tipo){
        this.tipo = tipo;
    }

    public void setQueso() {
        queso = true;
    }

    public void setLechuga() {
        lechuga = true;
    }

    public void setTomate() {
        tomate = true;
    }

    public void setDoble() {
        doble = true;
    }

    public void setCebolla() {
        cebolla = true;
    }

    public void setPepinillo() {
        pepinillo = true;
    }

    public void setBacon() {
        bacon = true;
    }

    public void setSalsaChile() {
        salsaChile = true;
    }

    public void setHuevo() {
        huevo = true;
    }

    @Override
    public String toString() {
        String descripción = tipo + "\n";
        descripción += (doble)? "- lleva dos hamburguesas\n":"- sólo lleva una hamburguesa\n";
        descripción += (queso)? "- con queso\n":"";
        descripción += (lechuga)? "- con lechuga\n":"";
        descripción += (tomate)? "- con tomate\n":"";
        descripción += (cebolla)? "- con cebolla\n":"";
        descripción += (pepinillo)? "- con pepinillo\n":"";
        descripción += (bacon)? "- con bacon\n":"";
        descripción += (salsaChile)? "- con salsa chile\n":"";
        descripción += (huevo)? "- con huevo":"";
        return descripción;
    }
}

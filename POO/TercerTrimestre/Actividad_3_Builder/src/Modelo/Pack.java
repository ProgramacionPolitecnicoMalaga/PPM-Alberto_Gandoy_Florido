package Modelo;

import HotelBuilder.TipoDeHabitacion;
import HotelBuilder.TipoDePack;

public class Pack {
    private TipoDePack.tipo tipoDePack = TipoDePack.tipo.basico;
    private TipoDeHabitacion.tipo tipoDeHabitacion = TipoDeHabitacion.tipo.simple;
    private boolean desayuno = false;
    private boolean almuerzo = false;
    private boolean cena = false;
    private boolean camaAdicional = false;
    private boolean paqueteAtracciones = false;
    private boolean cursoKiteSurf = false;
    private boolean actividadesInfantiles = false;
    private boolean cinePlaya = false;

    public void setTipoDePack(Pack packHotel) {
        this.tipoDePack = tipoDePack;
    }

    public void setTipoDeHabitacion(TipoDeHabitacion.tipo tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    public void setDesayuno() {
        this.desayuno = true;
    }

    public void setAlmuerzo() {
        this.almuerzo = true;
    }

    public void setCena() {
        this.cena = true;
    }

    public void setCamaAdicional() {
        this.camaAdicional = true;
    }

    public void setPaqueteAtracciones() {
        this.paqueteAtracciones = true;
    }

    public void setCursoKiteSurf() {
        this.cursoKiteSurf = true;
    }

    public void setActividadesInfantiles() {
        this.actividadesInfantiles = true;
    }

    public void setCinePlaya() {
        this.cinePlaya = true;
    }

    @Override
    public String toString() {
        String packs = tipoDePack + "\n";
        packs += (desayuno)? "- con salsa chile\n":"";
        packs += (almuerzo)? "- con salsa chile\n":"";
        packs += (cena)? "- con salsa chile\n":"";
        packs += (camaAdicional)? "- con salsa chile\n":"";
        packs += (paqueteAtracciones)? "- con salsa chile\n":"";
        packs += (cursoKiteSurf)? "- con salsa chile\n":"";
        packs += (actividadesInfantiles)? "- con salsa chile\n":"";
        packs += (cinePlaya)? "- con salsa chile\n":"";
        return packs;
    }
}

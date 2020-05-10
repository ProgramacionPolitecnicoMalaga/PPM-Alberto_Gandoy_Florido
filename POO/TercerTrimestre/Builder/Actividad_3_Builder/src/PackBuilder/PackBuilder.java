package PackBuilder;

import Producto.Pack;

public class PackBuilder {
    private Pack pack;

    public PackBuilder() {
        pack = new Pack();
    }

    public PackBuilder setTipoDePack(TipoDePack tipoDePack) {
        pack.setTipoDePack(tipoDePack);
        return this;
    }


    public PackBuilder addDesayuno() {
        pack.setDesayuno();
        return this;
    }

    public PackBuilder addAlmuerzo() {
        pack.setAlmuerzo();
        return this;
    }

    public PackBuilder addCena() {
        pack.setCena();
        return this;
    }

    public PackBuilder setTipoDeHabitacion(TipoDeHabitacion tipoDeHabitacion) {
        pack.setTipoDeHabitacion(tipoDeHabitacion);
        return this;
    }

    public PackBuilder addCamaAdicional() {
        pack.setCamaAdicional();
        return this;
    }


    public PackBuilder addPaqueDeAtracciones() {
        pack.setParqueDeAtracciones();
        return this;
    }

    public PackBuilder addCursoKiteSurf() {
        pack.setCursoDeKiteSurf();
        return this;
    }

    public PackBuilder addActividadesInfantiles() {
        pack.setActividadesInfantiles();
        return this;
    }

    public PackBuilder addCineEnLaPlaya() {
        pack.setCineEnLaPlaya();
        return this;
    }

    public Pack getPack() {
        return pack;
    }
}

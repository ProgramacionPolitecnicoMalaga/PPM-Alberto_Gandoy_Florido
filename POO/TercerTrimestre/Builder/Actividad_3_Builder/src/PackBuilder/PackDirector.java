package PackBuilder;

import Producto.Pack;

public class PackDirector {
    private PackBuilder packBuilder;

    public PackDirector(PackBuilder packBuilder) {
        this.packBuilder = packBuilder;
    }

    public Pack getBasico() {
        return packBuilder
                .setTipoDeHabitacion(TipoDeHabitacion.SIMPLE)
                .addDesayuno()
                .getPack();
    }

    public Pack getRomantico() {
        return packBuilder
                .setTipoDeHabitacion(TipoDeHabitacion.DOBLE)
                .addCena()
                .getPack();
    }

    public Pack getFamiliar() {
        return packBuilder
                .setTipoDeHabitacion(TipoDeHabitacion.DOBLE)
                .addCamaAdicional()
                .addDesayuno()
                .addAlmuerzo()
                .addCena()
                .addPaqueDeAtracciones()
                .addActividadesInfantiles()
                .addCineEnLaPlaya()
                .getPack();
    }

    public Pack getPadresRelajados() {
        return packBuilder
                .setTipoDeHabitacion(TipoDeHabitacion.DOBLE)
                .addCamaAdicional()
                .addDesayuno()
                .addAlmuerzo()
                .addCena()
                .addPaqueDeAtracciones()
                .addActividadesInfantiles()
                .addCineEnLaPlaya()
                .getPack();
    }

    public Pack getDeluxe() {
        return packBuilder
                .setTipoDeHabitacion(TipoDeHabitacion.SUITE)
                .addDesayuno()
                .addAlmuerzo()
                .addCena()
                .addCursoKiteSurf()
                .addCineEnLaPlaya()
                .getPack();
    }

    public Pack getDeluxeFamiliar() {
        return packBuilder
                .setTipoDeHabitacion(TipoDeHabitacion.SUITE)
                .addCamaAdicional()
                .addDesayuno()
                .addAlmuerzo()
                .addCena()
                .addPaqueDeAtracciones()
                .addCursoKiteSurf()
                .addActividadesInfantiles()
                .addCineEnLaPlaya()
                .getPack();
    }

}

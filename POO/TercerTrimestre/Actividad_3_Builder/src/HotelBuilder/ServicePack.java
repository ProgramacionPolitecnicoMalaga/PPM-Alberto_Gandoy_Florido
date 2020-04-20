package HotelBuilder;

public class ServicePack {
    private PackBuilder.HotelBuider packBuilder;

    public ServicePack(PackBuilder.HotelBuider packBuilder) {
        this.packBuilder = packBuilder;
    }

    public PackBuilder.HotelBuider packBasico() {
        return packBuilder.getTipoHabitacion(TipoDeHabitacion.tipo.simple).
                getDesayuno();
    }

    public PackBuilder.HotelBuider packRomantico() {
        return packBuilder.getTipoHabitacion(TipoDeHabitacion.tipo.doble).
                getCena();
    }

    public PackBuilder.HotelBuider packFamiliar() {
        return packBuilder.
                getTipoHabitacion(TipoDeHabitacion.tipo.doble).
                getCamaAdiccional().
                getDesayuno().
                getalmuerzo().
                getalmuerzo().
                getCena().
                getPaqtAtracciones().
                getActividadesInfantiles().
                getCinePlaya();
    }

    public PackBuilder.HotelBuider packPadresRelajados() {
        return packBuilder.getTipoHabitacion(TipoDeHabitacion.tipo.doble).
                getDesayuno().
                getalmuerzo().
                getCena().
                getActividadesInfantiles().
                getCursoKiteSurf().
                getCinePlaya();
    }

    public PackBuilder.HotelBuider packDeluxe() {
        return packBuilder.getTipoHabitacion(TipoDeHabitacion.tipo.suite).
                getDesayuno().
                getalmuerzo().
                getCena().
                getCursoKiteSurf().
                getCinePlaya();
    }
    public PackBuilder.HotelBuider packDeluxeFamiliar() {
        return packBuilder.getTipoHabitacion(TipoDeHabitacion.tipo.suite).
                getCamaAdiccional().
                getDesayuno().
                getalmuerzo().
                getCena().
                getCursoKiteSurf().
                getActividadesInfantiles().
                getCinePlaya();
    }


}

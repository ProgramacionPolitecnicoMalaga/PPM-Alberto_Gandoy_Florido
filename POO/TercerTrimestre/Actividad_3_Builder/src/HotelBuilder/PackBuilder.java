package HotelBuilder;

import Modelo.Pack;

public class PackBuilder {
    public static class HotelBuider extends Pack {
        private Pack packHotel;

        public HotelBuider() {
            packHotel = new Pack();
        }

        public HotelBuider getTipoDePack(TipoDePack tipoDePack) {
            packHotel.setTipoDePack(packHotel);
            return this;
        }

        public HotelBuider getTipoHabitacion(TipoDeHabitacion.tipo tipoDeHabitacion) {
            packHotel.setTipoDePack(packHotel);
            return this;
        }

        public HotelBuider getDesayuno() {
            packHotel.setDesayuno();
            return this;
        }

        public HotelBuider getalmuerzo() {
            packHotel.setAlmuerzo();
            return this;
        }

        public HotelBuider getCena() {
            packHotel.setCena();
            return this;
        }

        public HotelBuider getCamaAdiccional() {
            packHotel.setCamaAdicional();
            return this;
        }

        public HotelBuider getPaqtAtracciones() {
            packHotel.setPaqueteAtracciones();
            return this;
        }

        public HotelBuider getCursoKiteSurf() {
            packHotel.setCursoKiteSurf();
            return this;
        }

        public HotelBuider getActividadesInfantiles() {
            packHotel.setActividadesInfantiles();
            return this;
        }

        public HotelBuider getCinePlaya() {
            packHotel.setCinePlaya();
            return this;
        }

        public Pack getPackHotel() {
            return packHotel;
        }
    }

}

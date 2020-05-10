package Producto;

import PackBuilder.TipoDeHabitacion;
import PackBuilder.TipoDePack;

import java.util.Arrays;
import java.util.stream.Stream;

public class Pack {
    private TipoDePack tipoDePack = TipoDePack.BASICO;
    private boolean desayuno = false;
    private boolean almuerzo = false;
    private boolean cena = false;
    private TipoDeHabitacion habitacion = TipoDeHabitacion.SIMPLE;
    private boolean camaAdicional = false;
    private boolean parqueDeAtracciones = false;
    private boolean cursoDeKiteSurf = false;
    private boolean actividadesInfantiles = false;
    private boolean cineEnLaPlaya = false;

    public void setTipoDePack(TipoDePack tipoDePack) {
        this.tipoDePack = tipoDePack;
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

    public void setTipoDeHabitacion(TipoDeHabitacion tipoDeHabitacion) {
        this.habitacion = tipoDeHabitacion;
    }

    public void setCamaAdicional() {
        this.camaAdicional = true;
    }

    public void setParqueDeAtracciones() {
        this.parqueDeAtracciones = true;
    }

    public void setCursoDeKiteSurf() {
        this.cursoDeKiteSurf = true;
    }

    public void setActividadesInfantiles() {
        this.actividadesInfantiles = true;
    }

    public void setCineEnLaPlaya() {
        this.cineEnLaPlaya = true;
    }

    @Override
    public String toString() {
        String descripcion = tipoDePack + "\n";
        descripcion += (desayuno)? "Inglés\n" : "Americano\n";
        descripcion += (almuerzo)? "Completo\n" : "Dieta\n";
        descripcion += (cena)? "De campeones\n" : "Dieta\n";
        descripcion += (desayuno)? "Inglés\n" : "Americano\n";
        descripcion += (camaAdicional)? "Sí\n" : "No\n";
        descripcion += (parqueDeAtracciones)? "Sí\n" : "No\n";
        descripcion += (cursoDeKiteSurf)? "Sí\n" : "No\n";
        descripcion += (actividadesInfantiles)? "Sí\n" : "No\n";
        descripcion += (cineEnLaPlaya)? "Sí\n" : "No\n";
        return descripcion + TipoDeHabitacion.SUITE;

    }
}

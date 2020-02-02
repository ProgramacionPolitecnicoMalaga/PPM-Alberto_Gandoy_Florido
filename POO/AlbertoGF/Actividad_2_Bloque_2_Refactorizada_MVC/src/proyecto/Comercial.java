package proyecto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Comercial {
    private String nombre;
    private ArrayList<VentaMensual> ventasMensuales;
    private VentaMensual recordSemanaDeVentas;

    public Comercial(String nombre) {
        this.nombre = nombre;
        ventasMensuales = new ArrayList<>();
        recordSemanaDeVentas = new VentaMensual();
        new Venta(0); //lo inicializo  a 0, por que aún no han vendido nada, ya que lo estoy creadon.
    }

    public Comercial() {
        this.nombre = nombre;
        ventasMensuales = new ArrayList<>();
        new Venta(0); //lo inicializo  a 0, por que aún no han vendido nada, ya que lo estoy creadon.
        recordSemanaDeVentas = new VentaMensual();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<VentaMensual> getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(ArrayList<VentaMensual> ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    public VentaMensual getRecordVenta() {
        return recordSemanaDeVentas;
    }

    public void setRecordVenta(VentaMensual recordVenta) {
        this.recordSemanaDeVentas = recordVenta;
    }

    public void addVentaMensual(VentaMensual ventaMensual) {
         if (recordSemanaDeVentas.getVentas().size() < recordSemanaDeVentas.getVentas().size())
            setRecordVenta(ventaMensual);
       else
        ventasMensuales.add(ventaMensual);
    }

    public VentaMensual buscarVentaMensual(Calendar calendar) {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        int mesAbuscar = calendar.get(Calendar.MONTH);
        int anyoAbuscar = calendar.get(Calendar.YEAR);
        VentaMensual venta = null;
        boolean encontrado = false;
        int i = 0;
        while(i < ventasMensuales.size() && !encontrado){
            int mes = ventasMensuales.get(i).getFecha().get(Calendar.MONTH);
            int anyo = ventasMensuales.get(i).getFecha().get(Calendar.YEAR);
            if(mes==mesAbuscar && anyo==anyoAbuscar){
                encontrado = true;
                venta = ventasMensuales.get(i);
            }
        }
        return venta;
    }

    @Override
    public String toString() {
        return "proyecto.Comercial{" +
                "nombre='" + nombre + '\'' +
                ", ventaMensuales=" + ventasMensuales +
                ", recordSemanaDeVentas=" + recordSemanaDeVentas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comercial comercial = (Comercial) o;
        return Objects.equals(nombre, comercial.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}

package Bloque2_Actividad14;

public class LoteDeProductos {

    private Producto[] productos;
    private int totalProductos;
    private SelectorDeMejorProducto selectorDeMejorProducto;

    public LoteDeProductos(){
        totalProductos = 0;
        productos = new Producto[100];
        selectorDeMejorProducto = new CriterioMejorPrecio();
    }

    public void addProductos(Producto producto){
        if (producto == null){
            throw new NullProductoExcepcion("No se pueden crear productos nulos");
        }else {
            if(totalProductos < productos.length){
                productos[totalProductos] = producto;
                totalProductos++;
            }
        }
    }

    public Producto getProductoEnPosicion(int i) throws ProductoEnPosicionExcepcion{
        if ((i >= 0) && (i < totalProductos))
            return productos[i];
        else
            throw new ProductoEnPosicionExcepcion(i, totalProductos - 1);
    }

    public int getTotalProductos(){
        return totalProductos;
    }

    public void setSelectorDeMejorProducto(SelectorDeMejorProducto selectorDeMejorProducto){
        this.selectorDeMejorProducto = selectorDeMejorProducto;
    }

    public Producto getSellersChoice(){
        return selectorDeMejorProducto.elegirMejorProducto(this);
    }
}

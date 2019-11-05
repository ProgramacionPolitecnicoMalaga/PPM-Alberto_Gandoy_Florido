package Bloque2_Actividad14;

public class MainProductos {

    public static void main(String[] args) {
        LoteDeProductos lote = new LoteDeProductos();
        lote.addProductos(new Producto("producto 1",4.8,2.5));
        lote.addProductos(new Producto("producto 2",4.8,2.5));
        try {
            lote.addProductos(new Producto("Producto 3", 8.4,6.2));
            lote.addProductos(null);
        }catch (NullProductoExcepcion e){
            System.out.println(e);
            System.out.println("Algunos productos no están añadidos");
        }

        try {
            lote.getProductoEnPosicion(200);
        }catch (ProductoEnPosicionExcepcion e){
            System.out.println(e);
        }
        lote.setSelectorDeMejorProducto(new CriterioMejorPrecio());

        System.out.println(lote.getSellersChoice());

        lote.setSelectorDeMejorProducto(new CriterioMejorRatioValoracionPrecio());

        System.out.println(lote.getSellersChoice());

        lote.setSelectorDeMejorProducto(new CriterioMejorValorado());

        System.out.println(lote.getSellersChoice());
    }
}
